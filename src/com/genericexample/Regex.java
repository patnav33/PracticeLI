package com.genericexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		String s = "Location:  /ads/382928 "
				+ "PAper: 1i21i2i12"; 
//		Pattern pattern = Pattern.compile(" (?<=BookTitle).*?(?=)");
		Pattern pattern = Pattern.compile("(?<=ads/).*?(?=\\s)");
		Matcher matcher = pattern.matcher(s);

		boolean found = false;
		while (matcher.find())
		{
		    System.out.println("I found the text: " + matcher.group().toString().trim());
		    found = true;
		}
		if (!found)
		{
		    System.out.println("I didn't find the text");
		}
	}

}
