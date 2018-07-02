package com.designpattern.decorator;

public abstract class Currency {

	String descriptons="unknow currency";
	public String getDescription() {
		
		return descriptons;
	}
		
		public abstract void getValue(double d);
	 
}
