package com.tnsif.collections;

import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList ob = new ArrayList();
//		System.out.println("size of arraylist is "+" "+ob.size());
//		ob.add(2);
//		ob.add('r');
//		ob.add(3.14);
//		System.out.println("elements are:"+ob.contains('r'));
//		System.out.println("remove the element:"+ob.remove(2));
//		System.out.println("remaining elements are"+ob);
		ArrayList <String>ob = new ArrayList<String>();
		ob.add("banglore");
		ob.add("mysore");
		ob.add("hubballi");
		System.out.println(ob);
		Collections.sort(ob);
		System.out.println("sorted elements are:"+ob);
		Iterator<String> i=ob.iterator();
		while(i.hasNext()) {
			String a=i.next();
			System.out.println(a);
		}
	}

}