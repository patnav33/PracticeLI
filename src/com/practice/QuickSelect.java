package com.practice;

import java.util.ArrayList;
import java.util.List;

public class QuickSelect{
    
    public static void main(String args[]){
        
        int[] a ={34,12,35,23,67,13,78};
        int index = 3;
        int startIndex = 0;
        int endIndex = a.length - 1;
        int element = getKthElement(a,startIndex,endIndex,index);
        System.out.println("Largest:"+element);
        System.out.println();
        System.out.println("Largest " + index + ":");
        List<Integer> list = getTopKIntegers(a,index);
        for(Integer i: list){
            System.out.print(" "+i);
        }
    }
    
    
    public static int getKthElement(int[] num,int startIndex, int endIndex,int index){
       int pivot = partition(num, startIndex, endIndex);
       if( (pivot + 1) == index){
           return num[pivot];
       }
        if(pivot + 1 > index){
           return getKthElement(num,startIndex, pivot - 1,index);
       }
        else{
          return getKthElement(num,pivot + 1, endIndex,index);
       }
	
        
    }
    
    public static int partition(int[] a ,int start, int end){
        int pivot = (start+ end)/2;
        int pivotValue = a[pivot];
        int i = start;
        int j = end;
        while(i < j){
        
            while(pivotValue > a[i]){
                i++;
            }
            while(pivotValue < a[j]){
                j--;
            }
           if( i<j)
                swap(a,i,j);
        }
        return j;
    }
    
    
    public static void swap(int[] num ,int i ,int j){
        
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    
    public static List<Integer> getTopKIntegers(int[] num,int index){
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = num.length; i > num.length - index;i--){
               list.add(getKthElement(num,0,num.length - 1,i));
        }
        return list;
    }
    
    public static List<Integer> getSmallestKIntegers(int[] num, int index){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i <= index; i++) {
			list.add(getKthElement(num,0,num.length - 1,i));
		}
		return list;
	}
    
    
}