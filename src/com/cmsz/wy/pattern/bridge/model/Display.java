package com.cmsz.wy.pattern.bridge.model;

public class Display {
	private DisplayImpl impl;

	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public void open(){
		impl.rawOpen();
	}
	
	public void print(){
		impl.rawPrint();
	}
	
	public void close(){
		impl.rawClose();
	}
	
	public final void Display(){
		open();
		print();
		close();
	}
}
