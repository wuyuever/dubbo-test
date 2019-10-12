package com.cmsz.wy.pattern.state.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SafeFrame extends Frame implements ActionListener, Context{
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10, 60);
	private JButton buttonUse = new JButton("使用金库");
	private JButton buttonAlarm = new JButton("按下警铃");
	private JButton buttonPhone = new JButton("正常通话");
	private JButton buttonExit = new JButton("结束");

	private State state = DayState.getInstance();
	
	public SafeFrame(String title){
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		add(panel, BorderLayout.SOUTH);
		pack();
		show();
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}
	
	@Override
	public void setClock(int hour) {
		// TODO Auto-generated method stub
		String clockstring = "现在时间是：";
		if(hour < 10){
			clockstring += "0" + hour + ":00";
		}else{
			clockstring += hour + ":00";
		}
		System.out.println(clockstring);
		textClock.setText(clockstring);
		state.doClock(this, hour);
	}

	@Override
	public void ChangeState(State state) {
		// TODO Auto-generated method stub
		System.out.println("从" + this.state + "状态变为了" + state + "状态");
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		// TODO Auto-generated method stub
		textScreen.append("Call! " + msg + "\n");
	}

	@Override
	public void recordLog(String msg) {
		// TODO Auto-generated method stub
		textScreen.append("record ... " + msg + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		if(e.getSource() == buttonUse){
			state.doUse(this);
		}else if(e.getSource() == buttonAlarm){
			state.doAlarm(this);
		}else if(e.getSource() == buttonPhone){
			state.doPhone(this);
		}else if(e.getSource() == buttonExit){
			System.exit(0);
		}else{
			System.out.println("?");
		}
	}
}
