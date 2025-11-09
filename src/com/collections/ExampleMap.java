package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExampleMap {
	/*
	 * Map : Key and Value
	 * key : Unique
	 * Value: May be duplicated
	 * Map in java is a collection that stores in the form of key-value pairs
	 * Syntax:
	 * Map<K,V> refName = new ChildClass<K,V>();
	 * 
	 * Types:
	 * 1.HashMap
	 * 2.LinkedHashMap
	 * 3.TreeMap
	 * 4.HashTable
	 * 5.ConcurrentHashMap
	 * 
	 * 1.HashMap:
	 * Order: Random Order
	 * Key's can't be duplicate,Values can
	 * allows null [key: one null ,Value:Multiple Null value]
	 * very fast[uses hashing]
	 * Map<K,V> refName = new HashMap<K,V>();
	 * 
	 * 2.LinkedHashMap
	 * Order: Insertion Order
	 * Key's can't be duplicate,Values can
	 * allows null [key: one null ,Value:Multiple Null value]
	 * Slightly slower than HashMap
	 * Map<K,V> refName = new LinkedHashMap<K,V>();
	 * 
	 * 3.TreeMap
	 * Order: Ascending Order
	 * Key's can't be duplicate,Values can
	 * It won't allows null for key 
	 * Slightly slower than HashMap
	 * Map<K,V> refName = new TreeMap<K,V>();
	 * 
	 * 4.HashTable:
	 * Order: Random Order
	 * Key's can't be duplicate,Values can
	 * It won't allows null for key and value's
	 * Slower due to Synchronized
	 * Map<K,V> refName = new HashMap<K,V>();
	 */
	
	public static void main(String[] args) {
		Map<String,String> stdDetails = new HashMap<String,String>();
		System.out.println("stdDetails: "+stdDetails);
		stdDetails.put("101", "Java");
		stdDetails.put("102", "c#");
		stdDetails.put("103", "Python");
		stdDetails.put("104", "Selenium");
		stdDetails.put("105", "Api");
		stdDetails.put("101", "Shift");
		stdDetails.put("106", null);
		stdDetails.put(null, null);
		System.out.println("stdDetails: "+stdDetails);
		
		// to find the value for the given key
		String string = stdDetails.get("104");
		System.out.println("string: "+string);
		
		//key---> KeySet()
		Set<String> keySet = stdDetails.keySet();
		System.out.println("keySet: "+keySet);
		
		//values()
		
		Collection<String> values = stdDetails.values();
		System.out.println("values: "+values);
		
		// containsKey(),containsValue()
		
		boolean containsKey = stdDetails.containsKey("109");
		System.out.println("containsKey: "+containsKey);
		
		boolean containsValue = stdDetails.containsValue("c#");
		System.out.println("containsValue: "+containsValue);
		
		Set<Entry<String, String>> entrySet = stdDetails.entrySet();
		System.out.println("entrySet: "+entrySet);
		
		for(Entry<String, String> entry:entrySet) {
			System.out.println(entry);
			
		}
	}
}
