package com.cmsz.wy.pattern.facade.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
	private PageMaker(){
		
	}
	
	/**
	 * 外观模式
	 * @param mailaddr
	 * @param filename
	 */
	public static void makeWelcomePage(String mailaddr, String filename){
		try{
			Properties mailprop = Database.getProperties("maildata"); 
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + "'s page!");
			writer.paragraph(username + " 欢迎来到" + username + "的主页");
			writer.paragraph("等着你的邮件哦！！");
			writer.mainto(mailaddr, username);
			writer.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
