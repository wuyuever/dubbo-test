package com.cmsz.wy.pattern.prototype.model.framework;

public interface Product extends Cloneable {
	public abstract void use(String s);
	public abstract Product createClone();
}
