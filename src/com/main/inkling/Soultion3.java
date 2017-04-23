package com.main.inkling;

public class Soultion3 {
	
	 private static int[][] A;
	 private static int[][] B;
	 
	 private static int tot=0;
	
	public static void main(String args[]){
		
		
		A = new int[7][3];

//		  A[0][0] = 1;
//		  A[0][1] = 3;
//		  A[0][2] = 5;
//		  A[0][3] = 5;
//
//
//		  A[1][0] = 2;
//		  A[1][1] = 4;
//		  A[1][2] = 5;
//		  A[1][3] = 5;
//
//		  A[2][0] = 1;
//		  A[2][1] = 4;
//		  A[2][2] = 2;
//		  A[2][3] = 5;
		A[0][0] = 5;    
		A[0][1] = 4;    
		A[0][2] = 4;
		A[1][0] = 4;    
		A[1][1] = 3;    
		A[1][2] = 4;
		A[2][0] = 3;    
		A[2][1] = 2;    
		A[2][2] = 4;
		A[3][0] = 2;    
		A[3][1] = 2;    
		A[3][2] = 2;
		A[4][0] = 3;    
		A[4][1] = 3;    
		A[4][2] = 4;
		A[5][0] = 1;    
		A[5][1] = 4;   
		A[5][2] = 4;
		A[6][0] = 4;    
		A[6][1] = 1;    
		A[6][2] = 1;

		  countCountries();

		  System.out.println(tot);
		
		
	}
	
	private static int countCountries() {
		  if (A.length == 0) return 0;
		    int sum = 0;
		    int N = A.length;
		    int M = A[0].length; // N*M
		    if (N ==0 || M==0) return 0;
		    B = A;


		    for(int i=0; i<N; i++) 
		       for(int j = 0; j<M; j++) {
		         if (B[i][j] >= 0) {

		          checkNeighbor(A, B, i, j, N, M);
		          sum ++;
		         }
		       }
//		    System.out.println("sum " + sum);
		    return sum;
		 }

		 private static void checkNeighbor(int[][] A, int[][] B, int i, int j, int M, int N) {
		   if(B[i][j] == -1) return;
		    B[i][j] = -1;
		    if(i+1 < N-1) {
		      if( A[i+1][j] == A[i][j]) { 
		       checkNeighbor(A, B, i+1, j, N, M);
		      }else { 
		       tot+=1;
		      }
		    }

		     if(i-1 >= 0) {
		      if(A[i-1][j] == A[i][j]) { 
		       checkNeighbor(A, B, i-1, j, N, M);
		      }
		      else { 
		       tot+=1;
		      }
		    }
		       if(j+1 < M) {
		      if(A[i][j+1] == A[i][j]) checkNeighbor(A, B, i, j+1, N, M);
		      else tot+=1;
		      }

		       if(j-1 >= 0) {
		       if(A[i][j-1] == A[i][j]) checkNeighbor(A, B, i, j-1, N, M);
		       else tot+=1;
		      }
		   }

		 


}
