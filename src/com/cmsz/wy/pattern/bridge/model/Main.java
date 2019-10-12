package com.cmsz.wy.pattern.bridge.model;

/**
 * 桥接模式与模板方法模式区别：
 * 桥接模式，用单独的类来代理具体的实现方式，拆分出了模板方法模式中的方法。
 * 桥接模式与适配器模式的区别：
 * 两个模式很像，但是应用场景不同，称呼不一样。适配器主要是将被代理对象的方法转换为另一种方法，桥接主要是被代理对象的实现类可以方便替换。
 * 桥接模式，就是抽象出适配器模式中的被代理对象，使被代理对象的实现类可以很方便的被替换。
 * @author wuyu
 *
 */
public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, China."));
		Display d2 = new Display(new StringDisplayImpl("Hello, world!"));
		CountDisplay cd = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		
		d2.Display();
		cd.Display();
		cd.multiDisplay(5);
	}

}
