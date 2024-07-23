package com.tnsif.abstractprogram;

public class HItesha extends TaxPayer{

	public HItesha(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		return salary*0.15;
	}

}