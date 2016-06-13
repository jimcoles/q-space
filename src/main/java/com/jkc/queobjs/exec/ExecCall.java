package com.jkc.queobjs.exec;

import com.jkc.queobjs.api.Call;


public class ExecCall {
	private ExecAction xAction;
	private Call		call;

	public ExecCall(ExecAction parentAction, Call call) {
		this.xAction = parentAction;
	}

	ExecAction getxAction() {
		return xAction;
	}

	Call getCall() {
		return call;
	}

}
