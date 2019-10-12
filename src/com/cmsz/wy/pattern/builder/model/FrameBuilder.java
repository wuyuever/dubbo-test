package com.cmsz.wy.pattern.builder.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameBuilder extends Builder implements ActionListener {
	private JFrame frame = new JFrame();
	private Box box = new Box(BoxLayout.Y_AXIS);

	@Override
	public void makeTitle(String title) {
		frame.setTitle(title);
	}

	@Override
	public void makeString(String str) {
		box.add(new JLabel(str));
	}

	@Override
	public void makeItems(String[] items) {
		Box innerBox = new Box(BoxLayout.Y_AXIS);
		for (int i = 0; i < items.length; i++) {
			JButton button = new JButton(items[i]);
			button.addActionListener(this);
			innerBox.add(button);
		}
		box.add(innerBox);
	}

	@Override
	public void close() {
		frame.getContentPane().add(box);
		frame.pack();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("关闭");
				super.windowClosed(e);
				System.exit(0);
			}
			
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("开启");
				// TODO Auto-generated method stub
				super.windowOpened(e);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}

	public JFrame getResult() {
		return frame;
	}

}
