package com.twitter.almostengr.javacalculator;

public class Area {
	private static double length;
	private static double width;
	private double area;
	
	public static void setLength(double length) {
		Area.length = length;
	}
	
	public static void setWidth(double width) {
		Area.width = width;
	}
	
	public void calculateArea () {
		area = length * width;
		
		System.out.println("Area is: " + area);
	}
}
