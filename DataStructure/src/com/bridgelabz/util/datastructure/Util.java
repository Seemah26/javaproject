package com.bridgelabz.util.datastructure;

import java.util.Scanner;

public class Util {
	private static Scanner scanner=new Scanner(System.in);
	public static int getInt() {
		return scanner.nextInt();
	}
	public static String getString() {
		return scanner.next();
	}
	public static double getDouble() {
		return scanner.nextDouble();
	}
	
}
