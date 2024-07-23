package com.tnsif.abstractprogram;

public abstract class TaxPayer {
	protected double salary;//instance variable
	public TaxPayer(double salary) {
		super();
		this.salary = salary;
	}
	public abstract double calTax(); // abstract method
	public void display() { // non abstract method
		System.out.println("the tax payed is "+calTax());
		
}
	

}
