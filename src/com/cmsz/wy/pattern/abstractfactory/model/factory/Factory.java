package com.cmsz.wy.pattern.abstractfactory.model.factory;

public abstract class Factory {
	public static Factory getFactory(String classname){
		Factory factory = null;
		try{
			factory = (Factory)Class.forName(classname).newInstance();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println("没有找到" + classname + "类。");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
	
	public Page createYahooPage(){
		Page page = createPage("Yahoo!", "Yahoo!");
		Tray tray = createTray("Yahoo!");
		Link link = createLink("Yahoo!", "http://www.yahoo.com");
		tray.add(link);
		page.add(tray);
		return page;
		
	}
}
