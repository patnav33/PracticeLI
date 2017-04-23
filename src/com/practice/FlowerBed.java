package com.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author navinkumarpatil
 * 
 
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die. Given a flowerbed (represented as an array containing booleans), return if a given number of new flowers can be planted in it without violating the no-adjacent-flowers rule 
Sample inputs 

Input: 1,0,0,0,0,0,1,0,0 

3 => true 
4 => false 
Input: 1,0,0,1,0,0,1,0,0 

1 => true 
2 => false 
input: 0 

1 => true 
2 => false 

public boolean canPlaceFlowers(List<Boolean> flowerbed, int numberToPlace) { 

// Implementation here 
}
 *
*/


public class FlowerBed {
	
	
	public static void main(String args[]){
	       
//	       List<Boolean> a = {1,0,0,0,0,0,1,0,0};
//	       int n = 3;	//3,4
//	       
//	       System.out.println(canPlaceFlowers(a,n));
//	       System.out.println(canPlaceFlowers(a,4));
//	       System.out.println(canPlaceFlowers(a,2));
//	       
//	       int[] b ={1,0,0,1,0,0,1,0,0};
//	       System.out.println(canPlaceFlowers(b,1));
//	       System.out.println(canPlaceFlowers(b,2));
//	       
//	       int[] c = {0};
//	       System.out.println(canPlaceFlowers(c,1));
//	       System.out.println(canPlaceFlowers(c,2));
		
		List<Boolean> flowerbed = new ArrayList<Boolean>();
		flowerbed.add(true);
		flowerbed.add(false);
		flowerbed.add(false);
		flowerbed.add(false);
		flowerbed.add(false);
		flowerbed.add(false);
		flowerbed.add(true);
		flowerbed.add(false);
		flowerbed.add(false);
		
		boolean result = canPlaceFlowers(flowerbed ,2);
		System.out.println(result);
	   }

	public static boolean canPlaceFlowers(List<Boolean> flowerbed, int numberToPlace) { 
	
//		Another Logic
		
//		int place = 0;
//		if(flowerbed.isEmpty()){
//			return numberToPlace <= 0;
//		}
//		for(int i=0; i< flowerbed.size() ; i++){
//			if((i - 1 <0 || !flowerbed.get(i-1)) && !flowerbed.get(i) && (i+1)>=flowerbed.size() || flowerbed.get(i+1) ){
//				place += 1;
//				flowerbed.set(i, true);
//			}
//		}
//		
//		return place >= numberToPlace;
//		
		
		
		if (flowerbed == null || flowerbed.isEmpty()) {
			throw new IllegalArgumentException("bed is empty");
		}

		if (numberToPlace == 0)
			return true;

		if (flowerbed.size() == 1) {
			return !flowerbed.get(0) && numberToPlace <= 1;
		}

		int counter = 0;

		for (int i = 0; i < flowerbed.size(); i++) {
			if (!flowerbed.get(i)) {
				if ((i == 0 && !flowerbed.get(i + 1)) || (i == flowerbed.size() - 1 && !flowerbed.get(i - 1))
						|| (!flowerbed.get(i + 1) && !flowerbed.get(i - 1))) {
					flowerbed.set(i, true);
					counter++;
					if (counter == numberToPlace)
						return true;
				}
			}
		}

		return false;
	}	
	
	
//	public static boolean flow(int[] a, int n) {
//
//		if (a.length == 0 || n == 0 || a == null) {
//
//			return false;
//		}
//		int planted = 0;
//		int size = a.length;
//		int i = 0;
//		while (i < size) {
//
//			if (a[i] == 0) {
//				if (i + 1 < size) {
//					if (a[i + 1] == 0) {
//						planted++;
//						i += 2;
//					} else {
//						i += 3;
//					}
//
//				} else {
//					planted++;
//					i++;
//				}
//			} else {
//				i += 2;
//			}
//		}
//
//		if (planted == n)
//			return true;
//
//		return false;
//	}

}
