package com.cmsz.wy.pattern.Iterator.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Aggregate {
	private List books;

	public BookShelf(int maxsize) {
		books = new ArrayList<>(maxsize);
	}

	public void appendBook(Book book) {
		books.add(book);
	}

	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}

	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
