package com.bridgelabz.algorithprograms;

import com.bridgelabz.util.Algorithm;
import com.bridgelabz.util.FunctionalLogic;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("enter a first string ");
		String firstString = FunctionalLogic.getString();
		char[] s1 = firstString.toCharArray();
		
		System.out.println("enter a second string ");
		String secondString = FunctionalLogic.getString();
		char[] s2 = secondString.toCharArray();
		
		if (Algorithm.isAnagram(s1, s2))
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");

	}
}
