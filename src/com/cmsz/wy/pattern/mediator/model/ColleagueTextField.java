package com.cmsz.wy.pattern.mediator.model;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague{
	private Mediator mediator;
	
	public ColleagueTextField(String text, int columns) {
		// TODO Auto-generated constructor stub
		super(text, columns);
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
		setBackground(enabled? Color.white:Color.lightGray);
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		// TODO Auto-generated method stub
		mediator.colleagueChanged();
	}

}
