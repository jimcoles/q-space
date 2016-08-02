package org.jkcsoft.xqs.sample.model;

import org.jkcsoft.xqs.api.Action;
import org.jkcsoft.xqs.api.ActionContext;
import org.jkcsoft.xqs.api.QSpace;
import org.jkcsoft.xqs.api.util.AbstractSpace;
import org.jkcsoft.xqs.exec.SystemExecutor;
import org.jkcsoft.xqs.sample.model.actions.AddPerson;
import org.jkcsoft.xqs.sample.model.beans.AccountBean;
import org.jkcsoft.xqs.sample.model.beans.PersonBean;

import java.util.LinkedList;
import java.util.List;

/**
 * Sample QueueObject.  This guy advertises what he can do
 * but all things are done via the queue {@link SystemExecutor}.
 *
 * @author jcoles
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
