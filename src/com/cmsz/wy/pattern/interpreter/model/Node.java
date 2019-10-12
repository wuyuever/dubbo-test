package com.cmsz.wy.pattern.interpreter.model;

public abstract class Node {
	public abstract void parse(Context context) throws ParseException;
}
