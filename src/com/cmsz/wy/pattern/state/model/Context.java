package com.cmsz.wy.pattern.state.model;

public interface Context {
	public abstract void setClock(int hour);
	public abstract void ChangeState(State state);
	public abstract void callSecurityCenter(String msg);
	public abstract void recordLog(String msg);
}
