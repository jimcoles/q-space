package com.jkc.queobjs.api;


/**
 *
 * A QueueObject can only be accessed via a queue-based QOper request.
 * The idea is to provide a programmatically clean interface that is more convenient
 * the raw java.util.concurrent notions while still allowing the internals of this
 * object to operate on internal thread(s).  The most obvious application of this
 * is to a large domain "model" layer.
 *  
 * @author jcoles
 *
 */
public interface QueuedSpace extends ActionContext {
	
//	private Executor backExec = Executors.newSingleThreadExecutor();
//	
//	void doOp(QMOperation oper) {
//		backExec.execute(new QOperRunnable(oper));
//	}

}
