package com.tnsif.abstractprogram;

public abstract class Taxpayer {
	protected double salary;
	public abstract double calTax();//abstract method
	public void display() {
		System.out.println("the tax payed");
		
	}

}
