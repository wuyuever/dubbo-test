package com.cmsz.wy.pattern.command.model.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import com.cmsz.wy.pattern.command.model.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable{
	private Color color = Color.red;
	private int radius = 6;
	private MacroCommand history;
	
	public DrawCanvas(int width, int height, MacroCommand history){
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		history.execute();
	}
	
	@Override
	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x-radius, y-radius, radius * 2, radius * 2);
	}
}
