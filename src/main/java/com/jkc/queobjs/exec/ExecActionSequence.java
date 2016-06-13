package com.jkc.queobjs.exec;

import java.util.List;

import com.jkc.queobjs.api.Action;
import com.jkc.queobjs.api.ActionContext;
import com.jkc.queobjs.api.util.AbstractActionContext;

public class ExecActionSequence extends AbstractActionContext {

	private List<Action> actions;
	
	public ExecActionSequence(ActionContext parentContext, List<Action> actions) {
		super(parentContext);
		this.actions = actions;
	}

}
