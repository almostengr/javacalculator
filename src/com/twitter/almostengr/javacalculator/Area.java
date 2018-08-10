package com.twitter.almostengr.javacalculator;

public class Area {
	private static double length;
	private static double width;
	
	public static void setLength(double length) {
		Area.length = length;
	}
	
	public static void setWidth(double width) {
		Area.width = width;
	}
	
	public void calculateArea () {
		double area = length * width;
		
		System.out.println("Area is: " + area);
	}
}
