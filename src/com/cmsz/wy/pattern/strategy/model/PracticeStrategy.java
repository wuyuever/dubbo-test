package com.cmsz.wy.pattern.strategy.model;

import java.util.Random;

public class PracticeStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	private Hand prevHand;
	private boolean first = true;
	
	public PracticeStrategy(int seed){
		random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		// TODO Auto-generated method stub
		if(first){
			prevHand = Hand.getHand(random.nextInt(3));
			first = false;
			return prevHand;
		}
		if(!won){
			prevHand = Hand.getHand((prevHand.getHandValue() + 2) % 3);
		}else{
			prevHand = Hand.getHand((prevHand.getHandValue() + 1) % 3);
		}
		return prevHand;
	}

	@Override
	public void study(boolean win) {
		this.won = win;
	}

}
