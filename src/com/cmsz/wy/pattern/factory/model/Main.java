package com.cmsz.wy.pattern.factory.model;

import com.cmsz.wy.pattern.factory.model.framework.Factory;
import com.cmsz.wy.pattern.factory.model.framework.Product;
import com.cmsz.wy.pattern.factory.model.idcard.IDCardFactory;

public class Main {
	public static void main(String[] args){
		Factory factory = new IDCardFactory();
		Product p1 = factory.create("张三");
		Product p2 = factory.create("李四");
		Product p3 = factory.create("王五");
		p1.use();
		p2.use();
		p3.use();
	}
}
