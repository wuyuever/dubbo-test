package com.cmsz.wy.pattern.singleton.model;

public class Main implements Runnable{
	private static int thread_no = 0;
	private static Singleton[] list = new Singleton[100];

	public static void main(String[] args) {
		System.out.println("Start.");
		for(int i=0; i<100; i++){
			Thread t = new Thread(new Main());
			t.start();
		}
		System.out.println("Stop.");
		for(int i=0; i<100; i++){
			while(list[i] == null){
				try {
					Thread.currentThread().sleep(1000);
					System.out.println("等待...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		Singleton s1 = list[0];
		for(int i=0; i<100; i++){
			if(s1 == list[i]){
				System.out.print("True ");
			}
		}
	}
	
	public synchronized int getThreadNo(){
		return Main.thread_no ++;
	}
	
	@Override
	public void run() {
		Singleton singleton = Singleton.getInstance();
		System.out.println("获取一个实例");
		int thread = this.getThreadNo();
		list[thread] = singleton;
	}

}
