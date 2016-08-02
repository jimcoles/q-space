package org.jkcsoft.xqs.api.util;

import org.jkcsoft.xqs.api.ActionContext;


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
