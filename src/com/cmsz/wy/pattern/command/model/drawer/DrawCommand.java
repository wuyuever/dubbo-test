package com.cmsz.wy.pattern.command.model.drawer;

import java.awt.Point;

import com.cmsz.wy.pattern.command.model.command.Command;

public class DrawCommand implements Command{
	protected Drawable drawable;
	private Point position;
	
	public DrawCommand(Drawable drawable, Point position) {
		// TODO Auto-generated constructor stub
		this.drawable = drawable;
		this.position = position;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		drawable.draw(position.x, position.y);
	}
	
}
