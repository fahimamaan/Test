package com.designpattern.decorator;

public class USDecorator extends Decorator{
	 
	Currency cur;
	double value;
	public USDecorator(Currency cur) {
		// TODO Auto-generated constructor stub
		
		this.cur=cur;	
		}
	
	@Override
	public String getDescription() {
		
		return cur.getDescription() +", its US doller";
	}

	@Override
	public void getValue(double d) {
		value=d;
	}

}
