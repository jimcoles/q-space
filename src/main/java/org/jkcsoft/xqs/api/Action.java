package org.jkcsoft.xqs.api;

import org.jkcsoft.xqs.exec.ExecCall;

public interface Action<R> {

    R doAction(ExecCall call) throws Exception;

    ActionContext getContext();

}
