package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author navinkumarpatil

public interface TwoSum {
    
     * Stores @param input in an internal data structure.
     *
    void store(int input);
 
 
     * Returns true if there is any pair of numbers in the internal data structure which
     * have sum @param val, and false otherwise.
     * For example, if the numbers 1, -2, 3, and 6 had been stored,
     * the method should return true for 4, -1, and 9, but false for 10, 5, and 0
     
    boolean test(int val);
    
    
    Questions to ask: Does it have duplicates and is the array sorted?
}

*/

interface TwoSum{
    
    public void store(int input);
    public boolean test(int test);
}

 class TwoSumImplementation implements TwoSum{
    
    ArrayList<Integer> array = new ArrayList<Integer>();
    
     public void store(int input){
         array.add(input);
     }

    public boolean test(int test){
        boolean found = false;
        Set<Integer> set = new HashSet<Integer>();
        for( int i=0;i< array.size();i++){
            int sum = (test - array.get(i));
            if(!set.contains(sum)){
                set.add(array.get(i));
            }
            else{
                System.out.println("("+array.get(i)+","+ (test - array.get(i))+")");
                found = true;
//                return true;					//If u add this condition only one set would be found and not all
            }
        }
        if(found)	
        	return true;
     return false;   
    }
    
    /**
     * @param test
     * For returning the indexes of the found result
     * @return
     */
    public int[] test2(int test){
		
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	int[] result = new int[2];

    	for( int i=0;i< array.size();i++){
            if(map.containsKey(array.get(i))){
            	int index = map.get( array.get(i));
            	result[0] = index;
            	result[1] = i;
            }
            else{
            	map.put(test - array.get(i), i);
            }
    	}
    	return result;
    }
}

public class TwoSumProblem{

    
    public static void main(String args[]){
    
        TwoSumImplementation twoSum = new TwoSumImplementation();
        twoSum.store(1);
        twoSum.store(2);
        twoSum.store(6);
        twoSum.store(3);
        twoSum.store(4);
        twoSum.store(5);

        System.out.println(twoSum.test(10));
        System.out.println(twoSum.test(9));
        int[] result = twoSum.test2(10);
        System.out.println("Solution:");
        for( int a: result){
        	System.out.println(a);
        }
    }    
}
