package com.cmsz.wy.pattern.visitor.model;

public class File extends Entry{
	private String name;
	private int size;
	
	public File(String name, int size){
		this.name = name;
		this.size = size;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSize(){
		return size;
	}
	/**
	 * 具体处理都在ListVisitor中，被访问者自身不知道需要做什么。将具体的处理从数据结构中分离出来。
	 */
	public void accept(Visitor v){
		v.visit(this);
	}
}
