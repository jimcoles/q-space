package com.jkc.queobjs.sample.model.actions;

import com.jkc.queobjs.api.Action;
import com.jkc.queobjs.api.Call;
import com.jkc.queobjs.api.util.AbstractActionContext;
import com.jkc.queobjs.sample.model.PersonSpace;
import com.jkc.queobjs.sample.model.beans.PersonBean;
import com.jkc.spaces.Operation;

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
