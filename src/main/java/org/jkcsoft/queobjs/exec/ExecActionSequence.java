package org.jkcsoft.queobjs.exec;

import java.util.List;

import org.jkcsoft.queobjs.api.Action;
import org.jkcsoft.queobjs.api.ActionContext;
import org.jkcsoft.queobjs.api.util.AbstractActionContext;

public class ExecActionSequence extends AbstractActionContext {

	private List<Action> actions;
	
	public ExecActionSequence(ActionContext parentContext, List<Action> actions) {
		super(parentContext);
		this.actions = actions;
	}

}
