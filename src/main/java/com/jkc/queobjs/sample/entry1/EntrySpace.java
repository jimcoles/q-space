package com.jkc.queobjs.sample.entry1;

import com.jkc.queobjs.api.ActionContext;
import com.jkc.queobjs.api.ActionSequence;
import com.jkc.queobjs.api.Call;
import com.jkc.queobjs.api.QException;
import com.jkc.queobjs.api.QMachine;
import com.jkc.queobjs.exec.ExecActionSequence;
import com.jkc.queobjs.exec.SystemExecutor;
import com.jkc.queobjs.sample.model.PersonSpace;
import com.jkc.queobjs.sample.model.actions.AddPerson;

public class EntrySpace {
	
	public static void main(String[] args) {
		PersonSpace model = new PersonSpace();
		
		SystemExecutor exec = QMachine.getDefaultExecutor();
		ActionSequence sequence = new ExecActionSequence();
//		sequence.add()
		
		try {
			AddPerson addPerson = new AddPerson(model);
			addPerson
					.setFirst("Jim")
					.setLast("Colio");
			Object response = exec.exec(model, addPerson);
			QMachine.getSysLog().info("reponse " + response);
		} catch (QException e) {
			e.printStackTrace();
		}
	}
	
//	public interface MySeq {
//		/**
//		 * - action handler meta tags
//		 */
//		public void doWork() {
//			
//		}
//		
//		public void actOne() {
//			
//		}
//		
//		public void actTwo() {
//			
//		}
//	}
}
