package com.practice;

/**
 * @author navinkumarpatil
 * 
Find minimum distance between two words (order preserved) in a big string. 
For e.g 1. "hello how are you" - distance between "hello" and "you" is 3. 
e.g 2. "hello how are hello you" - distance is 1 
e.g 3. "you are hello" - distance is -1. Order of "hello" and "you" should be preserved. 
e.g 4. "hello how are hello" - distance is -1 since "you" didnt occur even once.
 
 
 
 *
 */
public class MinimumDistanceOfTwoWords {

	public static void main(String args[]){
		
		String input = "hello how are hello you";
		String word1 = "hello";
		String word2 = "you";
		
		int result = findMinimumDistance(input,word1,word2);
		System.out.println(result);
	}
	
	public static int findMinimumDistance(String str,String word1,String word2){
        if(str==null||word1==null||word2==null) 
        	return -1;
        
        if(word1.equals(word2)) 
        	return 0;
        
        String[] words = str.split(" ");
        
        int minDistance = -1,start=0,end;
        
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                start=i;
            }
            else if(words[i].equals(word2)){
                end = i;
                if(start<end&&minDistance!=-1)
                    minDistance=Math.min(minDistance,end-start);
                else if(start<end)
                    minDistance =end-start;
                else
                    minDistance=-1;
            }
        }
        return minDistance;
	}
}
