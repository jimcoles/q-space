package org.jkcsoft.queobjs.exec;

import java.util.LinkedList;
import java.util.List;

import org.jkcsoft.queobjs.api.Action;
import org.jkcsoft.queobjs.api.ActionContext;
import org.jkcsoft.queobjs.api.TransAction;
import org.jkcsoft.queobjs.api.util.AbstractActionContext;

public class ExecTransAction extends AbstractActionContext implements TransAction {
	
	private List<Action> actionStack = new LinkedList<Action>();

	public ExecTransAction(ActionContext parentContext) {
		super(parentContext);
	}

	void addAction(Action action) {
		
	}
	
}
