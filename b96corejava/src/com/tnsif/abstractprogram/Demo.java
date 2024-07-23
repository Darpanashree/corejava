package com.tnsif.abstractprogram;

import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary of Akash");
		double akashsalary = sc.nextDouble();
		
		TaxPayer ob = new Akash(akashsalary);
		
		System.out.println("enter the salary of Hitesha");
		double hiteshasalary = sc.nextDouble();
		
		TaxPayer obo = new HItesha(hiteshasalary);
		
		System.out.println("Tax Akash");
		ob.display();
		System.out.println("Tax Hitesha");
		obo.display();
		sc.close();
		
		
	}

}
