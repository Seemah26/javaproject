package com.bridgelabz.algorithprograms;

import com.bridgelabz.util.Algorithm;

public class Temperature {

	public static void main(String[] args) {

		System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
		int ch = Algorithm.getInt();
		conersion(ch);
	}

	private static void conersion(int ch) {
		double fahrenheit, c;
		switch (ch) {
		case 1:
			System.out.println("Enter  Fahrenheit temperature");
			fahrenheit = Algorithm.getDouble();
			c = (fahrenheit - 32) * 5 / 9;
			System.out.println("Celsius temperature is = " + c);
			break;
		case 2:
			System.out.println("Enter  Celsius temperature");
			c = Algorithm.getDouble();
			fahrenheit = ((9 * c) / 5) + 32;
			System.out.println("Fahrenheit temperature is = " + fahrenheit);
			break;
		default:
			System.out.println("please choose valid choice");
		}
	}

}
