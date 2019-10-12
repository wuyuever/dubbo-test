package com.cmsz.wy.pattern.strategy.model;

public interface Strategy {
	public abstract Hand nextHand();
	public abstract void study(boolean win);
}
