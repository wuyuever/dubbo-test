package com.cmsz.wy.pattern.prototype.model;

import com.cmsz.wy.pattern.prototype.model.framework.Product;
import com.cmsz.wy.pattern.prototype.model.framework.Manager;

public class Main {
	public static void main(String[] args){
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('$');
		manager.register("upen", upen);
		manager.register("mbox", mbox);
		manager.register("sbox", sbox);
		
		Product p1 = manager.create("upen");
		Product p2 = manager.create("mbox");
		Product p3 = manager.create("sbox");
		
		p1.use("Hello world!");//多态调用
		p2.use("Hello world!");
		p3.use("Hello world!");
	}
}
