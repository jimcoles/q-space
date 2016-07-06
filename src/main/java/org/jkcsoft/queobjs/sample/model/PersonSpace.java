package org.jkcsoft.queobjs.sample.model;

import java.util.LinkedList;
import java.util.List;

import org.jkcsoft.queobjs.api.Action;
import org.jkcsoft.queobjs.api.ActionContext;
import org.jkcsoft.queobjs.api.QSpace;
import org.jkcsoft.queobjs.api.util.AbstractSpace;
import org.jkcsoft.queobjs.exec.SystemExecutor;
import org.jkcsoft.queobjs.sample.model.actions.AddPerson;
import org.jkcsoft.queobjs.sample.model.beans.AccountBean;
import org.jkcsoft.queobjs.sample.model.beans.PersonBean;

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
