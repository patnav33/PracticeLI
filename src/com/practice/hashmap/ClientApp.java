package com.practice.hashmap;


public class ClientApp {
	
	public static void main(String args[]){
		
		CustomHashmap<String ,Integer> hashMap = new CustomHashmap<String,Integer>();
		hashMap.put("abc", 1);
		hashMap.put("def", 2);
		hashMap.put("ghi", 3);
		hashMap.put("jklm", 4);
		
CustomHashmap<String,Integer>.Entry<String, Integer>[] table = hashMap.table;
		
		for(CustomHashmap<String,Integer>.Entry<String, Integer> entry: table){
			while(entry!=null){
				System.out.println("key: " +entry.getKey() + " Value: " +entry.getValue() + " hash: " + entry.getHash());
				entry = entry.getNext();
			}
		}
	
	}
}
