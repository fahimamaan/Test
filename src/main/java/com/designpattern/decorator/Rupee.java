package com.designpattern.decorator;

public class Rupee extends Currency {

	  double value;
	  public Rupee() {
		  descriptons="Indian rupee";	
	  }
	@Override
	public void getValue(double d) {
		value=d;
	}

}
