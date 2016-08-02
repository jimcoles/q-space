package org.jkcsoft.xqs.exec;

import org.jkcsoft.xqs.api.Action;
import org.jkcsoft.xqs.api.ActionContext;
import org.jkcsoft.xqs.api.TransAction;
import org.jkcsoft.xqs.api.util.AbstractActionContext;

import java.util.LinkedList;
import java.util.List;

public class ExecTransAction extends AbstractActionContext implements TransAction {

    private List<Action> actionStack = new LinkedList<Action>();

    public ExecTransAction(ActionContext parentContext) {
        super(parentContext);
    }

    void addAction(Action action) {

    }

}
