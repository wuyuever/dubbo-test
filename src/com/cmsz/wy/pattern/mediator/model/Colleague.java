package com.cmsz.wy.pattern.mediator.model;

public interface Colleague {
	/**
	 * 设置Mediator
	 * @param mediator
	 */
	public abstract void setMediator(Mediator mediator);
	
	/**
	 * Mediator下达启用/禁用指令
	 * @param enabled
	 */
	public abstract void setColleagueEnabled(boolean enabled);
}
