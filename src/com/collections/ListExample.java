package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> stdName = new ArrayList<String>();
		System.out.println("List1: " + stdName);
		stdName.add("Ram");
		stdName.add("Dinesh");
		stdName.add("santhose");
		stdName.add("Kumar");
		stdName.add("Ram");
		stdName.add("Dinesh");
		System.out.println("List1: " + stdName);

		System.out.println("To find the size of object: " + stdName.size());

		stdName.set(2, "Vijay");
		System.out.println("List1: " + stdName);

		String name = stdName.get(2);
		System.out.println("index 2 - " + name);

		boolean contains = stdName.contains("Ram");
		System.out.println("contains: " + contains);

		int indexOf = stdName.indexOf("Kumar");
		System.out.println("indexOf: " + indexOf);

		stdName.remove(3);
		System.out.println("remove: " + stdName);

		// addALL()
		List<String> empName = new ArrayList<String>();
		empName.add("Java");
		empName.add("Ram");
		empName.add("Dinesh");

		System.out.println("List1: " + stdName);
		System.out.println("List2: " + empName);

		stdName.addAll(empName);
		System.out.println("AddAll() List1: " + stdName);

//		 stdName.removeAll(empName);
//		 System.out.println("Remove all: "+stdName);

		// retainALL
		stdName.retainAll(empName);
		System.out.println("retainAll: " + stdName);
		System.out.println("Size: "+stdName.size());
		
		for(int i = 0; i < stdName.size();i++) {
			String string = stdName.get(i);
			System.out.println(string);
		}
	}
}
