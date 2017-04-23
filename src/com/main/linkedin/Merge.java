package com.main.linkedin;

public class Merge {

	public static void main(String args[]){
		int[] a= {1,2,3,5};
		int[] b= {2,4,7,8};
		int[] c = merge(a,b);
		for( int h: c)
				System.out.println(h);
	}
	/**
	  * Function takes in two sorted arrays and returns a single sorted array
	  * Examples:
	  * 
	  * {1,3,5}, {2,4,7,8} returns {1,2,3,4,7,8}
	  * {12,100,1000,1001,2000} { 50,100,500} returns {12,50,100,100,500,1001,2000}
	*/
	public static int[] merge(int[] a, int[] b)
	{
	  //implement method here.
	  int aptr=0;    
	  int bptr=0;
	  int cptr=0;
	  int aSize = a.length;    //
	  int bSize = b.length;    // {2,4,7,8} - >4
	  int[] c = new int[aSize+bSize];
	  
	  if( a.length == 0 || b.length ==0)
	      return c;

	  
	  while(aptr < aSize && bptr < bSize){
	      
	          if(a[aptr] <= b[bptr]){    // 3<= 2
	              c[cptr++] = a[aptr++];    // c[0]= 1;
	          }
	         else if(a[aptr] >= b[bptr]){    //     3<=2
	              c[cptr++] = b[aptr++];     // c[1] = 2;
	          }
	      
	  }
	  while(aptr < aSize){
	      c[cptr++] = a[aptr++];
	  } 
	  while(bptr < bSize){            //    
	      c[cptr++] = b[bptr++];    //c[5] = 8;
	  }

	   return c;
	}

	// Tests: Test-> positive condition, negative condition
	    // array length is zero or not 
	    // array size of A is equal is array size of B
	    // array  size of A is greater than array of B 
	    // array size of B is greater than array of A
	    
	    


}
