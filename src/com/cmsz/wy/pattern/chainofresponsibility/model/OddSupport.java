package com.cmsz.wy.pattern.chainofresponsibility.model;

public class OddSupport extends Support{

	public OddSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() % 2 == 1){
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
