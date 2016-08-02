package org.jkcsoft.xqs.exec;

import org.jkcsoft.xqs.api.Action;
import org.jkcsoft.xqs.api.ActionContext;
import org.jkcsoft.xqs.api.util.AbstractActionContext;

import java.util.List;

public class ExecActionSequence extends AbstractActionContext {

    private List<Action> actions;

    public ExecActionSequence(ActionContext parentContext, List<Action> actions) {
        super(parentContext);
        this.actions = actions;
    }

}
