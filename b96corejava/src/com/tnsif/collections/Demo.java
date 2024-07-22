package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laps = new ArrayList<Laptop>();// create laps object of Laptop class
		laps.add(new Laptop("Dell",55000,12));
		laps.add(new Laptop("hp",50000,10));
		laps.add(new Laptop("Apple",20000,18));
		Collections.sort(laps);
		
		for(Laptop l: laps) {
			System.out.println(l);
		}
	}

}