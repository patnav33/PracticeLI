package com.practice;

/**
 * @author navinkumarpatil
 * 
 * Locker Problem
 *
 */
public class KulupPrashna{
    
    public static void main(String args[]){
        
        int n = 10;
        lock(n);
    }
    
    public static void lock(int n){
        
        boolean[] b = new boolean[n];  // check why is it n+1 
        for(int i=1; i< b.length;i++){
           for( int j = i;j <b.length ; j+=i){
           
           b[j]= !b[j];
            
         }   
         if(b[i]){
             System.out.println(i);
         }
        }
       
    }
    
}