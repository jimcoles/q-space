package org.jkcsoft.queobjs.exec;

import org.jkcsoft.queobjs.api.Action;
import org.jkcsoft.queobjs.api.ActionContext;
import org.jkcsoft.queobjs.api.util.AbstractActionContext;

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
			response = action.doAction(xcall.getCall());
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
