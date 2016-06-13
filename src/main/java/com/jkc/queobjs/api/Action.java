package com.jkc.queobjs.api;

public interface Action<R> {
	
	R doAction(Call call) throws Exception;
	ActionContext getContext();

}
