package com.practice.otherCompanies;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicateCharacterCount("JavaJEe");
		duplicateCharacterCount("FreshFish");
	}
	
	public static void duplicateCharacterCount(String input){
		
		input = input.trim();
		Map<Character,Integer>  map = new HashMap<Character,Integer>();
		
		char[] strArray = input.toCharArray();
		
		for(char c:strArray){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
		}
		
		System.out.println();
		for(Map.Entry<Character, Integer> getMap :  map.entrySet()){
			System.out.println(getMap.getKey()+" :"+getMap.getValue());
		}
		
	}
}
