package com.designpattern.decorator;

public class SGDecorator extends Decorator{
  Currency cur;
  double value;
  public SGDecorator(Currency cur) {
	// TODO Auto-generated constructor stub
	  this.cur=cur;
	  
}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cur.getDescription()+",its a singapur currency";
	}

	@Override
	public void getValue(double d) {
		// TODO Auto-generated method stub
		value=d;
	}

}
