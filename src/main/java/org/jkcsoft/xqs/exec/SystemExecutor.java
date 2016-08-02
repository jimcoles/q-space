package org.jkcsoft.xqs.exec;

import org.jkcsoft.xqs.api.Action;
import org.jkcsoft.xqs.api.QException;
import org.jkcsoft.xqs.api.QSpace;
import org.jkcsoft.xqs.api.TransAction;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Makes async access to QueueObjects look like synchronous.  This guy
 * will look alot like the executor of a scripting language.
 *
 * @author jcoles
 */
public class SystemExecutor {

    /* Global action table */
    private ActionContextTable act = new ActionContextTable();
    /* Managed queues for each space */
    private Map<QSpace, Executor> queueMap = new HashMap();

    /**
     * Called on consumer thread
     */
//	public void exec(QSpace target, ActionSequence sequence) {
//		exec(target, sequence.toArray(new Action[0]));
//	}
//
    public Object exec(QSpace target, Action action) {
        return exec(target, action);
    }

    public Object exec(TransAction transAm, QSpace target, Action action, ExecCall call) throws QException {
        ExecAction innerAction = new ExecAction(transAm, action, call);
        getQueue(target).execute(innerAction);
        if (innerAction.getException() != null) {
            throw new QException(innerAction.getException());
        }
        return innerAction.getResponse();
    }

    private Executor getQueue(QSpace target) {
        Executor queue = queueMap.get(target);
        if (queue == null) {
            queue = Executors.newSingleThreadExecutor();
            queueMap.put(target, queue);
        }
        return queue;
    }

}
