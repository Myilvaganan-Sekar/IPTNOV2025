package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {
	/* SET: [I]
	 * It is an Interface
	 * It is based on value
	 * It prints in random order
	 * It won't allow the duplicate object
	 * 
	 * Types or child of Set:
	 *	1.HashSet[C]
	 *		It prints in random order
	 *		It allows single null 
	 *      It is value based 
	 *      It won't allow the duplicate Objects
	 *  2.LinkedHashSet[C]
	 *		It prints in Insertion order
	 *		It allows single null 
	 *      It is value based 
	 *      It won't allow the duplicate Objects
	 *  3.TreeSet[C]
	 *		It prints in Ascending order
	 *		It Won't allows even the single single null 
	 *      It is value based 
	 *      It won't allow the duplicate Objects   
*/
	public static void main(String[] args) {
		Set<String> setOne = new HashSet<>();
		System.out.println("setOne: " + setOne); // []
		setOne.add(null);
		setOne.add("Apple");
		setOne.add("Banana");
		setOne.add("Orange");
		setOne.add("Apple");
		setOne.add("Banana");
		System.out.println("setOne: " + setOne);

		Iterator<String> itr = setOne.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
	}
}
