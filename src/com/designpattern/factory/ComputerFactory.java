package com.designpattern.factory;

public class ComputerFactory {
	
	public static Computer getComputer(String type ,String hdd,String cpu,String ram){
		
		if("PC".equals(type))return new PC(ram,hdd,cpu);
		 else if("Server".equals(type)) return new Server(ram,hdd,cpu);
				
		
		return null;

	}
}
