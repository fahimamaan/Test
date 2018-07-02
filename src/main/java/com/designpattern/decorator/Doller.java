package com.designpattern.decorator;

public class Doller extends Currency{

	double value;
	public Doller () {
		descriptons="Doller";
	}
	@Override
	public void getValue(double d) {
   value=d;

		
	}

}
