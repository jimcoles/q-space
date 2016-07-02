package com.jkc.queobjs.exec;

import com.jkc.queobjs.api.Call;

/**
 * Executive context for a action/operation call.
 */
public class ExecCall {

	private ExecAction	xAction;
	private Call		call;

	public ExecCall(ExecAction parentAction, Call call) {
		this.xAction = parentAction;
	}

	ExecAction getxAction() {
		return xAction;
	}

    // TODO Genericize
    public abstract Object getParameters();

}
