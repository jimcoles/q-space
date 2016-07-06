package org.jkcsoft.queobjs.sample.model.actions;

import org.jkcsoft.queobjs.api.Action;
import org.jkcsoft.queobjs.api.Call;
import org.jkcsoft.queobjs.api.util.AbstractActionContext;
import org.jkcsoft.queobjs.sample.model.PersonSpace;
import org.jkcsoft.queobjs.sample.model.beans.PersonBean;

public class AddPerson extends AbstractActionContext implements Action<PersonBean> {

	private PersonSpace parent;
	private String first;
	private String last;
	
	public AddPerson(PersonSpace parent) {
		super(parent);
		this.parent = parent;
	}


	@Override
	public PersonBean doAction(Call call) throws Exception {
		return parent.addPerson(first, last);
	}


	public PersonSpace getParent() {
		return parent;
	}


	public AddPerson setParent(PersonSpace parent) {
		this.parent = parent;
		return this;
	}


	public String getFirst() {
		return first;
	}


	public AddPerson setFirst(String first) {
		this.first = first;
		return this;
	}


	public String getLast() {
		return last;
	}


	public AddPerson setLast(String last) {
		this.last = last;
		return this;
	}

	public static class Params {
		public String firstName;
		public String lastName;
	}
}
