package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracesMatching{

    
    public static void main(String args[]){
        
        String s = "{{(())}}";
        boolean result = braces(s);
        System.out.println(result);
    }
    	
    public static boolean braces(String s){
        
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        for( int i =0 ;i <s.length();i++){
          Character key = s.charAt(i);
            
          Character value = map.get(key);
          
          if(stack.isEmpty() && value == null)
              return false;
          
          if( value != null)
              stack.push(value);
             
          if( value == null && (!stack.isEmpty()) && (stack.peek().equals(key)) )
              stack.pop();
          
        }
        
        return stack.isEmpty();
    }
}