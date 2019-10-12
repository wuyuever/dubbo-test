package com.cmsz.wy.pattern.memento.model;

public class Main {
	public static void main(String[] args){
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		for(int i=0; i<100; i++){
			System.out.println("==========" + i);
			System.out.println("当前状态：" + gamer);
			
			gamer.bet();
			
			System.out.println("所持有的金钱为 " + gamer.getMoney() + " 元。");
			if(gamer.getMoney() > memento.getMoney()){
				System.out.println("所持金钱增多了，保存游戏状态");
				memento = gamer.createMemento();
			}else if(gamer.getMoney() < memento.getMoney() / 2){
				System.out.println("所持金钱减少了许多，回退游戏状态");
				gamer.restoreMemento(memento);
			}
			
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("");
		}
	}
}
