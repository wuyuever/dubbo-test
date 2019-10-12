package com.cmsz.wy.pattern.strategy.model;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seed1 = 0;
		int seed2 = 0;
		if (args.length != 2){
			seed1 = new Random().nextInt();
			seed2 = new Random().nextInt();
		}else{
			seed1 = Integer.parseInt(args[0]);
			seed2 = Integer.parseInt(args[1]);
		}
		Player player1 = new Player("张三", new ProbStrategy(seed1));
		Player player2 = new Player("李四", new RandomStrategy(seed2));
		for(int i =0 ;i<1000; i++){
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			System.out.println("player1:" + nextHand1.toString() + " VS " + nextHand2.toString() + ":player2");
			if(nextHand1.isStrongerThan(nextHand2)){
				System.out.println("winner:" + player1);
				player1.win();
				player2.lose();
			}else if(nextHand1.isWeakerThan(nextHand2)){
				System.out.println("winner:" + player2);
				player1.lose();
				player2.win();
			}
			else{
				System.out.println("Even");
				player1.even();
				player2.even();
			}
		}
		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		
	}

}
