package com.jkc.queobjs.api.util;

import java.util.logging.Logger;

import com.jkc.queobjs.api.ActionContext;
import com.jkc.queobjs.exec.SystemExecutor;


/**
 * Top-level Q system object.  Aka, the QVM; the global context.
 * 
 * @author jcoles
 *
 */
public class QSystem extends AbstractActionContext implements ActionContext {

	private static SystemExecutor defExec = new SystemExecutor();
	
	public static SystemExecutor getDefaultExecutor() {
		return defExec;
	}

	//-------------------------------------------------------------------------
	//
	//-------------------------------------------------------------------------
	
	public QSystem(ActionContext parentContext) {
		super(parentContext);
		// TODO Auto-generated constructor stub
	}
	
	private static Logger log = Logger.getLogger(QSystem.class.getSimpleName());

	public static Logger getSysLog() {
		return log;
	}
}
