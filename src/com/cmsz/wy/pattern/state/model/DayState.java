package com.cmsz.wy.pattern.state.model;

public class DayState implements State{
	private static DayState singleton = new DayState();
	
	public static DayState getInstance(){
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(hour < 9 || hour >= 17){
			context.ChangeState(NightState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("使用金库（白天）");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("按下警铃（白天）");
	}
	
	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("正常通话（白天）");
	}
	
	public String toString(){
		return "[白天]";
	}

}
