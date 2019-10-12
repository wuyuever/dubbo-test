package com.cmsz.wy.pattern.mediator.model;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;
	
	public ColleagueButton(String caption){
		super(caption);
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
	}

	/**
	 * 当组件状态发生变化时，通知Mediator
	 */
	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

}
