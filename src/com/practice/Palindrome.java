package com.practice;

public class Palindrome{
    
    public static void main(String args[]){
        
        String s = "radar";
        
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome(""));
        
    }
    
    
    public static boolean isPalindrome(String s){
        
    	if(s == null || s.isEmpty())	
    		return false;
    	
        int i =0;
        int j = s.length() - 1;
        
        while( i< j){
            
            if( s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else
               return false;
        }
        
        return true;
    }


}