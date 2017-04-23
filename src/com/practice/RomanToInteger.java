package com.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger{
    
    public static void main(String args[]){
        
        String input = "VIII";      
        int result = romanToInt(input);
        System.out.println(result);
        String input2 = "IV";
        System.out.println(romanToInt(input2));
    }
    
    public static int romanToInt(String s){
        
        if(s == null || s.isEmpty())
            return 0;
            
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int length = s.length();                    //5
        int lastDigit = map.get(s.charAt(length - 1));      
        for( int i =0 ;i <= length - 2 ; i++){            
            
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1)))    //I > I
                lastDigit += map.get(s.charAt(i));               // 1+6 -> 7
            else if(map.get(s.charAt(i)) <=  map.get(s.charAt(i+1)))    // I < V
                lastDigit -= map.get(s.charAt(i));                      //5-1 ->4
            
        }
        
        return lastDigit;
    }
    
   
        
      
    

}