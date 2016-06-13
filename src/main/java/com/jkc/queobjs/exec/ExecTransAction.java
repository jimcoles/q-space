package com.jkc.queobjs.exec;

import java.util.LinkedList;
import java.util.List;

import com.jkc.queobjs.api.Action;
import com.jkc.queobjs.api.ActionContext;
import com.jkc.queobjs.api.TransAction;
import com.jkc.queobjs.api.util.AbstractActionContext;

public class ExecTransAction extends AbstractActionContext implements TransAction {
	
	private List<Action> actionStack = new LinkedList<Action>();

	public ExecTransAction(ActionContext parentContext) {
		super(parentContext);
	}

	void addAction(Action action) {
		
	}
	
}
