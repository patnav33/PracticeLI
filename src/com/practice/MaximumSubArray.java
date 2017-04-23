package com.practice;

public class MaximumSubArray{

    public static void main(String args[]){
        
        int[] a = {1, -2, -3, 0, 7, 8, -2};
        getMaximumSubArray(a);
        int m = 5;
        int b = -6;
        int result = (int) (Math.sqrt(m*m+b*b- 2*m*b)+(m+b)/2);
        System.out.println(result);
    }
    
    public static void getMaximumSubArray(int[] a){
        
        if(a.length <= 1)
            return;
         
        int tempSum = a[0];
        int maxSum = a[0];
        int beginTemp = 0;
        int begin = 0;
        int end = 0;
        
        for(int i =1 ;i < a.length;i++){
            
            tempSum = tempSum + a[i];
            if(tempSum < a[i]){
                tempSum = a[i];
                beginTemp = i;
            }
            
            if(tempSum > maxSum){
                maxSum = tempSum;
                begin = beginTemp;
                end = i;
            }
       
        }
        
//        if(input == null || input.length == 0)
//            return;
//     
//    int newSum =input[0];
//    int maxSum =input[0];
//     
//    for(int i=1;i<input.length;i++){
//        
//        newSum=Math.max(newSum+input[i],input[i]);
//        
//        maxSum= Math.max(maxSum, newSum);
//        
//    }
//     
//     System.out.println(maxSum);
     
        
        System.out.println("begin index :"+begin);
        System.out.println("end index :"+end);
        System.out.print("SubArray: ");
        for( int i = begin ; i<= end; i++)
            System.out.print(a[i]+",");
        System.out.println();
        System.out.println("Get Maximum Subarray : "+ maxSum);   
                  
    }
}