package com.thc.baseservice.Service;

public abstract class AbstractTHCService<R,A> {
	private R result;
	private A agrs;
	
	
	
	public AbstractTHCService() {
		super();
	}
	public AbstractTHCService(R result, A agrs) {
		super();
		this.result = result;
		this.agrs = agrs;
	}
	public R getResult() {
		return result;
	}
	public void setResult(R result) {
		this.result = result;
	}
	public A getAgrs() {
		return agrs;
	}
	public void setAgrs(A agrs) {
		this.agrs = agrs;
	}

	abstract R create(A args);
	
}
