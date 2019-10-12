package com.cmsz.wy.pattern.adapter.model.extend;

public class Main {
	public static void main(String[] args){
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
