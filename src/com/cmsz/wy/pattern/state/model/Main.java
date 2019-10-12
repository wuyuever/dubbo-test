package com.cmsz.wy.pattern.state.model;

public class Main {
	public static void main(String[] args){
		SafeFrame sf = new SafeFrame("State Sample");
		while(true){
			for(int hour = 0;hour < 24; hour ++){
				sf.setClock(hour);
				
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		}
	}
}
