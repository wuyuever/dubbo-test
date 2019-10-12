package com.cmsz.wy.pattern.abstractfactory.model.tablefactory;

import com.cmsz.wy.pattern.abstractfactory.model.factory.Link;

public class TableLink extends Link {

	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return "<td><a href=\"" + url + "\">" + caption + "</a></td>";
	}

}
