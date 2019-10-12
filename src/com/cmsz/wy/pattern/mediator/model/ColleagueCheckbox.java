package com.cmsz.wy.pattern.mediator.model;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague{
	private Mediator mediator;
	
	public ColleagueCheckbox(String caption, CheckboxGroup group, Boolean state) {
		// TODO Auto-generated constructor stub
		super(caption, group, state);
	}
	
	public void setMediator(Mediator mediator){
		this.mediator = mediator;
	}
	
	
	public void itemStateChanged(ItemEvent e){
		mediator.colleagueChanged();
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
	}
}
