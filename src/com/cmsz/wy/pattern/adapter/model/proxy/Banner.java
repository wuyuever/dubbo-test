package com.cmsz.wy.pattern.adapter.model.proxy;

public class Banner {
	private String string;

	public Banner(String string) {
		super();
		this.string = string;
	}
	
	public void showWithParen(){
		System.out.println("(" + string + ")");
	}
	
	public void showWithAster(){
		System.out.println("*" + string + "*");
	}
}
