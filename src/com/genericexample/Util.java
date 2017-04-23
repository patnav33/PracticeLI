package com.genericexample;

import java.util.ArrayList;
import java.util.List;

public class Util {
	
	public static List<?> generateDate(int res){
		
		if( res == 0){
			Model mo = new Model();
			List<A> a = new ArrayList<A>();
			A smallA = new A("name");
			a.add(smallA);
			return a;
		}
		else if(res == 1){
			Model mo = new Model();
			List<B> b = new ArrayList<B>();
			B smallB = new B();
			smallB.setId("id");
			b.add(smallB);
			return b;
			
		}
		return null;
	}

}
