package com.cmsz.wy.pattern.composite.model;

public abstract class Entry {
	protected Entry parent;
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	
	/**
	 * 在访问者模式中，该方法被抽象到单独的类中，由外部驱动。
	 */
	public void printList(){
		printList("");
	}
	
	protected abstract void printList(String prefix);
	
	public String toString(){
		return getName() + "(" + getSize() + ")";
	}
	
	public String getFullName(){
		StringBuffer fullname = new StringBuffer();
		Entry entry = this;
		do{
			fullname.insert(0, "/" + entry.getName());
			entry = entry.parent;
		}while(entry!=null);
		return fullname.toString();
	}
	
}
