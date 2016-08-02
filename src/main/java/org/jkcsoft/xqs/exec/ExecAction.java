package org.jkcsoft.xqs.exec;

import org.jkcsoft.xqs.api.Action;
import org.jkcsoft.xqs.api.ActionContext;
import org.jkcsoft.xqs.api.util.AbstractActionContext;

public class ExecAction extends AbstractActionContext implements Runnable {

    private Action action;
    private ExecCall xcall;
    private Object response;
    private Throwable exception;

    public ExecAction(ActionContext parentContext, Action action, ExecCall xcall) {
        super(parentContext);
        this.action = action;
        this.xcall = xcall;
    }

    public void run() {
        try {
            response = action.doAction(xcall);
        } catch (Exception e) {
            exception = e;
        }
    }

    Object getResponse() {
        return response;
    }

    Throwable getException() {
        return exception;
    }

}
