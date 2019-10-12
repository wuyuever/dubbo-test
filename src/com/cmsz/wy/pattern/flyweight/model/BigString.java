package com.cmsz.wy.pattern.flyweight.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BigString {
	private BigChar[] bigchars;
	
	public BigString(String string){
		bigchars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for(int i = 0; i < bigchars.length; i++){
			bigchars[i] = factory.getBigChar(string.charAt(i));
		}
	}
	
	public void print(){
		for(int i=0; i<bigchars.length; i++){
			bigchars[i].print();
		}
	}
	
	public void printOneline(){
		Iterator iter = bigchars[0].iterator();
		List<Iterator> iterlist = new ArrayList();
		for(int i=0; i<bigchars.length; i++){
			iterlist.add(bigchars[i].iterator());
		}
		int i = 1;
		while(iter.hasNext()){
			System.out.print("line: " + i);
			for(Iterator lineiter: iterlist){
				System.out.print(lineiter.next().toString());
			}
			iter.next();
			System.out.print("\n");
			i++;
		}
	}
}
