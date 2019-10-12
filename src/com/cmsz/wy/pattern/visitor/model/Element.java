package com.cmsz.wy.pattern.visitor.model;

public interface Element {
	public abstract void accept(Visitor v);
}
