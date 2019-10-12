package com.cmsz.wy.pattern.Iterator.model;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if(this.index < bookShelf.getLength()){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Book book = this.bookShelf.getBookAt(index);
		index ++;
		return book;
	}

}
