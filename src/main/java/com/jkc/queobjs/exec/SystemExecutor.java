package com.jkc.queobjs.exec;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.jkc.queobjs.api.Action;
import com.jkc.queobjs.api.Call;
import com.jkc.queobjs.api.QException;
import com.jkc.queobjs.api.QueuedSpace;
import com.jkc.queobjs.api.TransAction;

/**
 * Makes async access to QueueObjects look like synchronous.  This guy
 * will look alot like the executor of a scripting language.
 * 
 * @author jcoles
 *
 */
public class SystemExecutor {

	/* Global action table */
	private ActionContextTable 			act = new ActionContextTable();	
	/* Managed queues for each space */
	private Map<QueuedSpace, Executor> 	queueMap = new HashMap<>();

	/** Called on consumer thread */
//	public void exec(QueuedSpace target, ActionSequence sequence) {
//		exec(target, sequence.toArray(new Action[0]));
//	}
//
	public void exec(QueuedSpace target, Action ... actions) {
		for (Action action : actions) {
			exec(target, action);
		}
	}
	
	public Object exec(TransAction transAm, QueuedSpace target, Action action, Call call) throws QException {
		ExecAction innerAction = new ExecAction(action);
		getQueue(target).execute(innerAction);
		if (innerAction.getException() != null) {
			throw new QException(innerAction.getException());
		}
		return innerAction.getResponse();
	}

	private Executor getQueue(QueuedSpace target) {
		Executor queue = queueMap.get(target);
		if (queue == null) {
			queue = Executors.newSingleThreadExecutor();
			queueMap.put(target, queue);
		}
		return queue;
	}
	
}
