package org.jkcsoft.queobjs.sample.entry1;

import org.jkcsoft.queobjs.api.QSystem;
import org.jkcsoft.queobjs.exec.SystemExecutor;
import org.jkcsoft.queobjs.sample.model.PersonSpace;
import org.jkcsoft.queobjs.sample.model.actions.AddPerson;

public class EntrySpace {
	
	public static void main(String[] args) {
		PersonSpace model = new PersonSpace(null);
		
		SystemExecutor exec = QSystem.getDefaultExecutor();
//		ActionSequence sequence = new ExecActionSequence();
//		sequence.add()
		
		try {
			AddPerson addPerson = new AddPerson(model);
			addPerson
					.setFirst("Jim")
					.setLast("Colio");
			Object response = exec.exec(model, addPerson);
			QSystem.getSysLog().info("response " + response);
		} catch (Exception e) {
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
