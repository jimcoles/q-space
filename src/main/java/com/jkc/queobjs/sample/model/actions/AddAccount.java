package com.jkc.queobjs.sample.model.actions;

import com.jkc.queobjs.api.Action;
import com.jkc.queobjs.api.ActionContext;
import com.jkc.queobjs.api.Call;
import com.jkc.queobjs.exec.ExecCall;
import com.jkc.queobjs.sample.model.beans.AccountBean;

public class AddAccount implements Action<AccountBean> {

	@Override
	public AccountBean doAction(ExecCall xCall) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionContext getContext() {
		return null;
	}
}
