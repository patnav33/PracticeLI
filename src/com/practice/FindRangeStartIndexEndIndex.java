package com.practice;

public class FindRangeStartIndexEndIndex {

    public static void main(String[] args){

            int[] arr1 = {0, 2, 3, 10, 10};
            FindRange(arr1, 10);
            FindRange(arr1, 6);
    }
     
     public static void FindRange(int[] arr, int target){
         
         int low = 0;
         int high = arr.length - 1 ; 
         int mid = 0;
         while(high>=low){
             mid = (low+high )/2;
             if( arr[mid] == target)
                 break;
             else if( arr[mid] > target){
                 high = mid -1;
             }
             else if( arr[mid] < target){
                 low = mid+1;
             }    
              
         }
         if( high <low){
            System.out.println("Number not found" + -1);
            return;
         }
         int left = mid , right = mid;
         while( right < arr.length - 1 && arr[right +1] == target){
             right ++;
         }
         while( left > 0 && arr[ left -1] == target){
             left--;
         } 
         System.out.println("(" + left + "," + right + ")");
     
     }


}    