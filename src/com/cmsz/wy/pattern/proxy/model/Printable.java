package com.cmsz.wy.pattern.proxy.model;

public interface Printable {
	public abstract void setPrinterName(String name);
	public abstract String getPrinterName();
	public abstract void print(String string);
}
