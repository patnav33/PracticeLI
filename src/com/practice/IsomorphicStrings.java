package com.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author navinkumarpatil
 * 
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.

For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.


Given two (dictionary) words as Strings, determine if they are isomorphic. 
Two words are called isomorphic 
if the letters in one word can be remapped to get the second word.
 Remapping a letter means replacing all 
occurrences of it with another letter while the ordering of the letters remains unchanged.
 No two letters may map to the same letter, but a letter may map to itself. 

Example: 
given "foo", "app"; returns true 
we can map 'f' -> 'a' and 'o' -> 'p' 
given "bar", "foo"; returns false 
we can't map both 'a' and 'r' to 'o' 

given "turtle", "tletur"; returns true 
we can map 't' -> 't', 'u' -> 'l', 'r' -> 'e', 'l' -> 'u', 'e' -'r' 

given "ab", "ca"; returns true 
we can map 'a' -> 'c', 'b'

 *
 */
public class IsomorphicStrings{

    
    public static void main(String args[]){
    
        String s= "egg";
        String t= "add";
        
       boolean result = isomorphic(s,t);
       System.out.println(result);
       System.out.println(isomorphic("tletur", "turtle"));
       System.out.println(isomorphic("ab", "ca"));
       System.out.println(isomorphic("foo", "bar"));
       
    }
    
    public static boolean isomorphic(String s, String t){
        
         if(s==null || t==null)
            return false;
        
        if(s.length() != t.length())
            return false;
 
        if(s.length()==0 && t.length()==0)
            return true;
        
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        for(int i=0;i < s.length(); i++){
            
            char c1 = s.charAt(i);            // egg -> o
            char c2 = t.charAt(i);            // add -> r
            
            Character c = getKey(map,c2);       
            if(c !=null && c != c1){          // 
                return false;
            }
            else if( map.containsKey(c1)){    // map contains o
                if( c2 != map.get(c1))        // r != a
                    return false;
            }
            else{
                map.put(c1,c2);
            }
             
        }
        
        return true;
        
    }
    
    public static Character getKey(HashMap<Character,Character> map , Character target){
        
        for(Map.Entry<Character,Character> entry :map.entrySet()){
            if( entry.getValue().equals(target)){    
               return entry.getKey();        
            }
        }
      return null;
    }
}