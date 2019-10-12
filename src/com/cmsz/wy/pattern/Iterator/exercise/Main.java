package com.cmsz.wy.pattern.Iterator.exercise;

import java.util.Iterator;

/**
 * @author wuyu
 *
 */
public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(2);
		bookShelf.appendBook(new Book("深入理解操作系统"));
		bookShelf.appendBook(new Book("Java并发编程的艺术"));
		bookShelf.appendBook(new Book("Spring实战"));
		bookShelf.appendBook(new Book("HTTP抓包实战"));
		bookShelf.appendBook(new Book("Python基础教程"));
		bookShelf.appendBook(new Book("Oracle PL/SQL实例精解"));
		bookShelf.appendBook(new Book("红色基因代代传"));
		
		Iterator it = bookShelf.iterator();
		int i = 0;
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println((++i) + ":" + book.getName());
		}

	}

}
