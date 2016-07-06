package org.jkcsoft.queobjs.api.util;

import org.jkcsoft.queobjs.api.ActionContext;


public class AbstractActionContext implements ActionContext {

	private ActionContext parentContext;
	
	public AbstractActionContext(ActionContext parentContext) {
		super();
		this.parentContext = parentContext;
	}

	@Override
	public ActionContext getContext() {
		return parentContext;
	}

}
