package com.cmsz.wy.pattern.flyweight.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BigChar implements Iterable{
	private char charname;
	private String prefix = "config//pattern//flyweight//";
	
	private String fontdata;
	
	public BigChar(char charname){
		this.charname = charname;
		try{
			BufferedReader reader = new BufferedReader(new FileReader(prefix + "big" + charname + ".txt"));
			String line;
			StringBuffer buffer = new StringBuffer();
			while((line=reader.readLine())!=null){
				buffer.append(line);
				buffer.append("\n");
			}
			reader.close();
			this.fontdata = buffer.toString();
		}catch (IOException e) {
			// TODO: handle exception
			this.fontdata = charname + "?";
		}
	}
	
	public void print(){
		System.out.println(fontdata);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		List lines = new ArrayList();
		try{
			BufferedReader reader = new BufferedReader(new FileReader(prefix + "big" + charname + ".txt"));
			String line;
			while((line=reader.readLine())!=null){
				lines.add(line);
			}
			reader.close();
			return lines.iterator();
		}catch (IOException e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public static void main(String[] args){
		BigChar bc = new BigChar('1');
		Iterator iter = bc.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().toString());
		}
	}
}
