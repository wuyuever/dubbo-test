package com.cmsz.wy.pattern.abstractfactory.model.listfactory;

import com.cmsz.wy.pattern.abstractfactory.model.factory.Factory;
import com.cmsz.wy.pattern.abstractfactory.model.factory.Link;
import com.cmsz.wy.pattern.abstractfactory.model.factory.Page;
import com.cmsz.wy.pattern.abstractfactory.model.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		// TODO Auto-generated method stub
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new ListPage(title, author);
	}

}
