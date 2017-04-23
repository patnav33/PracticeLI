package com.practice;

import java.util.ArrayList;
import java.util.List;

public class NestedIntegerConcrete {
    public int getSum(List<NestedInteger> list, int depth){// ({1,1},2)
        if(list == null || list.isEmpty()){
            return 0;
        }
        
        int sum=0;
        for(NestedInteger nestedInt:list){   //{1,1} <=  {{1,1},2,{1,1}}    // {1}1st <= {1,1} // {1}2nd<={1,1}
            if(nestedInt.isInteger()){  //{1} => true // {2} => true
                sum = sum + (nestedInt.getInteger() * depth); //0 + (1*2) => 2 + (1*2) => 4 /// 4 + 2 = 6
            } else {
                sum = sum + getSum(nestedInt.getList(),depth+1) ; //0 + getSum({1,1},1+1) => 0 + 4 = 4 =>6+4=10
            }
        }
        return sum;//4
    }
                      
    public int getSum(List<NestedInteger> list){
        if(list == null || list.isEmpty()){
            return 0;
        } else {
            return getSum(list,1);// => {NI{NI,NI},NI,NI{NI,NI}}
        }       
    }
    
//    public static void main(String args[]){
//    	List<NestedInteger> list = new ArrayList<NestedInteger>();
//    	list.add({1,1});
//    	getSum(list);
//    }
//    
    
}



//{{1,1},2,{1,1}} - {NestedInteger-> {1,1},NestedInteger->2,NestedInteger->{1,1}}
//{NestedInteger-> {1,1} {NestedInteger(1),NestedInteger(1)},NestedInteger->2,NestedInteger->{1,1}}
//
//{1*{1,1},1*2,1*{1,1}} =>{1*{1,1} + 1*2 + 1*{1,1}} => {1*{{2*1}+{2*1}}, 1*2, 1*{{2*1}+{2*1}}} => 10



/** 
* Given a nested list of integers, returns the sum of all integers in the list weighted by their depth 
* For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1) 
* Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, one 6 at depth2) 
*/ 
/** 
* This is the interface that represents nested lists. 
* You should not implement it, or speculate about its implementation. 
*/ 
interface NestedInteger { 
    // Returns true if this NestedInteger holds a single integer, rather than a nested list 
    public boolean isInteger(); 

    // Returns the single integer that this NestedInteger holds, if it holds a single integer 
    // Returns null if this NestedInteger holds a nested list 
    public Integer getInteger(); 

    // Returns the nested list that this NestedInteger holds, if it holds a nested list 
    // Returns null if this NestedInteger holds a single integer 
    public List<NestedInteger> getList(); 
}