package com.practice;

import java.util.Stack;

public class ReversePolishNotation{ 
    
    public static void main(String args[]){
        
        String[]  s= {"2", "1", "+", "3", "*"};
//      String[]  s= {"2", "1", "+", "+","3", "*"}; can add stack.isEmpty before popping two elements
        int result = reversePolish(s);
        System.out.println(result);
        
        
    }
    
    public static int reversePolish(String[] token){
     
     if( token == null || token.length==0 )
         return 0; 
         
     Stack<String> stack = new Stack<String>();
     String operators = "+-*/";
     
     for(String s:token){                    
         if(!operators.contains(s)){           //Dont' Forget the ! in the condition 
        	 stack.push(s);
         }
     else{
     
         int a = Integer.valueOf(stack.pop());    
         int b = Integer.valueOf(stack.pop());    
     
         int operator = operators.indexOf(s);    
     
         switch(operator){
         
         case 0: stack.push(String.valueOf(a+b));
                 break; 
         
         case 1: stack.push(String.valueOf(a-b));
                 break; 
         
         case 2: stack.push(String.valueOf(a*b));
                 break; 
         
         case 3: stack.push(String.valueOf(b/a));
                 break; 
         }
      }
      
    }
     int result =  Integer.valueOf(stack.pop());  
     
        
        return result;
    }
    
}