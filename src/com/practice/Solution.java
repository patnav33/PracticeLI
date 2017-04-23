package com.practice;

import java.io.*;
import java.util.*;

public class Solution {
    
    static Map<String,Integer> map = new HashMap<String,Integer>();
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner sc = new Scanner(System.in);
        int stringLength = sc.nextInt();
        
        int min = sc.nextInt();
        
        int max = sc.nextInt();
        
        int maxAlpha = sc.nextInt();
        
        String inputString = sc.next();
        
        int result = count(stringLength,min,max,maxAlpha,inputString);
        System.out.println(result);
        
        
    }
    
    public static int count(int stringLength,int min,int max,int maxAlpha,String inputString){
        
        if(inputString == null || inputString.isEmpty())
              return 0;
        
        if(stringLength <= 0)
              return 0;
        
        
         return getAllStrings(inputString,min,max);
        
    }
    

    public static int count(final String string, final String substring){

    int count = 0;

    int idx = 0;

    while ((idx = string.indexOf(substring, idx)) != -1){
        idx++;
        count++;
    }
    return count;

  }
    
    public static int getAllStrings(String string,int min,int max){

      String  sub;

      int i, c, length;

      length = string.length();   

      //System.out.println("Substrings of \""+string+"\" are :-");

      for( c = 0 ; c < length ; c++ ){
        for( i = min ; i <= length - c ; i++ ){
            
            
            sub = string.substring(c, c+i);

           // System.out.println(sub);

            if(map.containsKey(sub))

            {

            int freq = map.get(sub);

            map.put(sub, ++freq);

            }else

            {

            map.put(sub, 1);

            }

           // System.out.println("count of sub: "+count(string,sub));
            
        }
      }

      return getMaximumOccurence();

    }
    
    public static int getMaximumOccurence(){

        int max =0;
        
        for(Map.Entry<String,Integer> entry : map.entrySet()){

            if(entry.getValue() > max)  {

            max = entry.getValue();

            }
        }

        return max;
    }
}