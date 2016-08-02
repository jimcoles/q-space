package org.jkcsoft.xqs.api;

import org.jkcsoft.xqs.api.util.AbstractActionContext;
import org.jkcsoft.xqs.exec.SystemExecutor;

import java.util.logging.Logger;


/**
 * Top-level Q system object.  Aka, the QVM; the global context.
 *
 * @author jcoles
 */
public class QSystem extends AbstractActionContext implements ActionContext {

    private static SystemExecutor defExec = new SystemExecutor();

    public static SystemExecutor getDefaultExecutor() {
        return defExec;
    }

    //-------------------------------------------------------------------------
    //
    //-------------------------------------------------------------------------

    public QSystem(ActionContext parentContext) {
        super(parentContext);
        // TODO Auto-generated constructor stub
    }

    private static Logger log = Logger.getLogger(QSystem.class.getSimpleName());

    public static Logger getSysLog() {
        return log;
    }
}
