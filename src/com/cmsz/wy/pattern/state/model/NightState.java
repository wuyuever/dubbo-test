package com.cmsz.wy.pattern.state.model;

public class NightState implements State{
	private static NightState singleton = new NightState();
	
	public static State getInstance(){
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if( hour >= 9 && hour <= 17){
			context.ChangeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("紧急：晚上使用金库！");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("按下警铃（晚上）");
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("晚上的通话录音");
	}
	
	public String toString(){
		return "[晚上]";
	}
}
