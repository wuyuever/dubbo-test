package com.cmsz.wy.pattern.mediator.model;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * 仲裁者模式
 * @author wuyu
 *
 */
public class LoginFrame extends Frame implements ActionListener, Mediator{
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOK;
	private ColleagueButton buttonCancel;
	
	public LoginFrame(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setBackground(Color.lightGray);
		setLayout(new GridLayout(4,2));
		createColleagues();
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		add(new Label("Password:"));
		add(textPass);
		add(buttonOK);
		add(buttonCancel);
		colleagueChanged();
		pack();
		show();
	}

	@Override
	public void createColleagues() {
		// TODO Auto-generated method stub
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, false);
		checkLogin = new ColleagueCheckbox("Login", g, true);
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		buttonOK = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOK.setMediator(this);
		buttonCancel.setMediator(this);
		
		checkGuest.addItemListener(checkGuest);;
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOK.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	/**
	 * 接受来自于Colleague的通知，然后判断各Colleague的启用/禁用状态
	 */
	@Override
	public void colleagueChanged() {
		// TODO Auto-generated method stub
		if(checkGuest.getState()){
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOK.setColleagueEnabled(false);
		}else{
			textUser.setColleagueEnabled(true);
			userpassChanged(); 
		}
	}
	
	public void userpassChanged(){
		if(textUser.getText().length() > 4){
			textPass.setColleagueEnabled(true);
			if(textPass.getText().length() > 4){
				buttonOK.setColleagueEnabled(true);
			}else{
				buttonOK.setColleagueEnabled(false);
			}
		}else{
			textPass.setColleagueEnabled(false);
			buttonOK.setColleagueEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		System.exit(0);
	}

}
