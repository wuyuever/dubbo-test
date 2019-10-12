package com.cmsz.wy.pattern.builder.model;

import javax.swing.JFrame;

public class Main {
	/**
	 * Builder模式与template模式非常相似，
	 * 区别在于，
	 * Builder模式中，构建步骤的方法由单独的指导类负责构建，可以通过重构指导类来完成流程编排，无需修改基类
	 * 而template模式构建的步骤直接由抽象父类进行控制，一旦要修改流程，则需要重构基类。
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length != 1){
			usage();
			System.exit(0);
		}
		if(args[0].equals("plain")){
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
		}else if (args[0].equals("html")){
			HtmlBuilder htmlbuilder = new HtmlBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String filename = htmlbuilder.getResult();
			System.out.println(filename + "文档编写完成。");
		}else if (args[0].equals("frame")){
			FrameBuilder framebuilder = new FrameBuilder();
			Director director = new Director(framebuilder);
			director.construct();
			JFrame frame = framebuilder.getResult();
			frame.setVisible(true);
		}else{
			usage();
			System.exit(0);
		}
	}
	
	public static void usage(){
		System.out.println("Usage: java Main plain    编写纯文本文档");
		System.out.println("Usage: java Main html     编写HTML文档");
	}

}
