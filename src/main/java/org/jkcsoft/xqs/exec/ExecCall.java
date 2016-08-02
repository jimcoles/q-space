package org.jkcsoft.xqs.exec;

import org.jkcsoft.xqs.api.Call;

/**
 * Executive context for a action/operation call.
 */
public abstract class ExecCall {

    private ExecAction xAction;
    private Call call;

    public ExecCall(ExecAction parentAction, Call call) {
        this.xAction = parentAction;
    }

    ExecAction getxAction() {
        return xAction;
    }

    // TODO Genericize
    public abstract Object getParameters();

}
