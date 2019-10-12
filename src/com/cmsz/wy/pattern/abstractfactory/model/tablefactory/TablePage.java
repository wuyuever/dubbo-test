package com.cmsz.wy.pattern.abstractfactory.model.tablefactory;

import java.util.Iterator;

import com.cmsz.wy.pattern.abstractfactory.model.factory.Item;
import com.cmsz.wy.pattern.abstractfactory.model.factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><meta charset=\"utf-8\"><title>" + title + "</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>" + title + "</h1>\n");
		buffer.append("<table width=\"80%\" border=\"3\">\n");
		Iterator it = content.iterator();
		while(it.hasNext()){
			Item item = (Item) it.next();
			buffer.append("<tr>" + item.makeHTML() + "</tr>");
		}
		buffer.append("</table>\n");
		buffer.append("</ul>\n");
		buffer.append("<hr><address>" + author + "</address>");
		buffer.append("</body></html>\n");
		return buffer.toString();
	}

}
