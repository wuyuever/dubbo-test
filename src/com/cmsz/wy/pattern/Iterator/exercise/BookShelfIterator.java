package com.cmsz.wy.pattern.Iterator.exercise;

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
		return bookShelf.getBookAt(this.index++);
	}

}
