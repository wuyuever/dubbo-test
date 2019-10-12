package com.cmsz.wy.pattern.chainofresponsibility.model;

public class NoSupport extends Support{

	public NoSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void done(Trouble trouble) {
		// TODO Auto-generated method stub
		System.out.println("[Trouble " + trouble.getNumber() + "] is resolved by " + this);
	}

}
