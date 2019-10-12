package com.cmsz.wy.pattern.proxy.model;

public class Printer implements Printable{
	private String name;
	
	public Printer() {
		// TODO Auto-generated constructor stub
		heavyJob("Printer的实例生成中");
	}
	
	public Printer(String name){
		this.name = name;
		heavyJob("Printer的实例生成中（" + name + "）");
	}

	private void heavyJob(String msg) {
		// TODO Auto-generated method stub
		System.out.print(msg);
		for(int i =0; i<5; i++){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println("结束。");
	}

	@Override
	public void setPrinterName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
		System.out.println("===" + name + "===");
		System.out.println(string);
	}
	
}
