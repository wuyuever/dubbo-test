package com.cmsz.wy.pattern.chainofresponsibility.model;

public class LimitSupport extends Support{
	private int limit;

	public LimitSupport(String name, int limit) {
		super(name);
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() < limit){
			return true;
		}else{
			return false;
		}
	}

	@Override
	protected void done(Trouble trouble) {
		System.out.println("[Trouble " + trouble.getNumber() + "] is resolved by " + this);
	}

}
