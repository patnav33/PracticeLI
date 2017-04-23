package com.leetcode;

public class ZigZagWordConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = convert("PAYPALISHIRING",3);
		System.out.println(s);
	}
	
	public static String convert(String s,int nRows){
		
		if( nRows < 1)
			return s;
		
		StringBuilder[] sb = new StringBuilder[nRows];
		for(int i = 0; i < nRows; i++){
			sb[i] = new StringBuilder();
			
		}
		
		int row = 0;
		int  j = 0;
		boolean down = true;
		while( j < s.length()){
			sb[row].append(" "+s.charAt(j));
			if(row == 0){
				down = true;
			}
			if( row == nRows - 1){
				down = false;
			}
			if(down){
				row++;
				
			}
			else{
				row --;
				
			}
			
			j++;
		}
		StringBuilder res = new StringBuilder();
		for(StringBuilder st: sb){
				res.append(st.toString());
				res.append("\n");
		}
		return res.toString();
	}
}
