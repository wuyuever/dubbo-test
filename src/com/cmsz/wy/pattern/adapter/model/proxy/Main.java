package com.cmsz.wy.pattern.adapter.model.proxy;

public class Main {
	public static void main(String[] args){
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
