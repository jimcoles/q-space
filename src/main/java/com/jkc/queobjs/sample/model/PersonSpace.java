package com.jkc.queobjs.sample.model;

import java.util.LinkedList;
import java.util.List;

import com.jkc.queobjs.api.Action;
import com.jkc.queobjs.api.ActionContext;
import com.jkc.queobjs.api.QSpace;
import com.jkc.queobjs.api.util.AbstractSpace;
import com.jkc.queobjs.exec.SystemExecutor;
import com.jkc.queobjs.sample.model.actions.AddPerson;
import com.jkc.queobjs.sample.model.beans.AccountBean;
import com.jkc.queobjs.sample.model.beans.PersonBean;

/**
 * Sample QueueObject.  This guy advertises what he can do
 * but all things are done via the queue {@link SystemExecutor}.
 * 
 * @author jcoles
 *
 */
public class PersonSpace extends AbstractSpace implements QSpace {
	
	public PersonSpace(ActionContext parentContext) {
		super(parentContext);
	}

	public Action<PersonBean> ADD_USER = new AddPerson(this);
	
	private List<PersonBean> persons = new LinkedList();
	private List<AccountBean> accounts = new LinkedList();
	
	
	/*
	 * Object results = callAsyncBackend()
	 * if(results is)
	 * {
	 * }
	 * 
	 */

	public PersonBean addPerson(String first, String last) {
		PersonBean person = new PersonBean(first, last);
		persons.add(person);
		return person;
	}
	
}
