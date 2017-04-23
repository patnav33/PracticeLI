package com.practice;

import java.util.HashSet;

public class AnagramVariations{

    
    public static void main(String args[]){
        
        String s = "abc";
        String t = "bca";
       boolean result = isAnagram(s,t);
        System.out.println(result);
        permute("abc".toCharArray(),0);
        String str = "cat";
        HashSet<String> permutations = permute2(str);
        System.out.println(permutations.toString());

    }
    
    public static boolean isAnagram(String s ,String t){
        
        if(s == null || t == null || s.isEmpty() || t.isEmpty())
            return false;
            
        StringBuilder str = new StringBuilder(t);
        for(int i=0;i<s.length(); i++){
            
            char input = s.charAt(i);
            
            int index = str.indexOf(String.valueOf(input));
            
            if(index < 0)
                return false;
            
            str.delete(index,index+1);
        }
        
        return str.toString().isEmpty(); 
    } 
    
    
    public static void permute(char[] s,int currFoc){
        
        if(s.length == currFoc){
            System.out.println(s);
            return;
        }
        
        permute(s,currFoc+1);
        
	        for(int i=currFoc+ 1;i<s.length;i++){
	           
	           if(s.length != currFoc){
	           
	           //swap 1
	           char temp = s[i];
	           s[i] = s[currFoc];
	           s[currFoc] = temp;
	           
	           permute(s,currFoc+1);
	           
	           temp = s[i];
	           s[i] = s[currFoc];
	           s[currFoc] = temp;
	           
	           }          
	        }
    }   
    
    /**
     * @param str
     * Time complexity  O(n*n!)
     * @return
     */
    public static HashSet<String> permute2(String str){
    	
        HashSet<String> permutations = new HashSet<String>();
        
        if(str == null || str.length() == 0){
        	permutations.add("");
        	return 	permutations;
        }
        
        char first = str.charAt(0);
        String remainingString = str.substring(1);
        HashSet<String> words = permute2(remainingString);
        for(String word : words){
        	
        	for(int i=0;i <= word.length();i++){
        		
        	String prefix = word.substring(0, i);	
        	String suffix = word.substring(i);
        	permutations.add(prefix+first+ suffix);
        	
        	}
        	
        }
    	
    	return permutations;
    }
}