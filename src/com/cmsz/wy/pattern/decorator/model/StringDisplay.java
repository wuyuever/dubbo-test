package com.cmsz.wy.pattern.decorator.model;

public class StringDisplay extends Display {
	private String string;
	
	public StringDisplay(String string){
		this.string = string;
	}

	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return string.getBytes().length;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row == 0){
			return string;
		}
		return null;
	}

}
