package com.bridgelabz.util.datastructure;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Datastructure {
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
	public static ArrayList<Integer> prime() {
		ArrayList<Integer> prime=new ArrayList<Integer>();
	String primeNumbers =" ";
	for (int i = 0; i <= 1000; i++) {
		int counter = 0;
		for (int j = i; j >= 1; j--) {
			if (i % j == 0) {
				counter = counter + 1;
			}
		}
		if (counter == 2) {
			prime.add(i);
		}
	}

	//System.out.println(primeNumbers);
	return prime;
	
}
	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	public static boolean areParenthesisBalanced(char[] ch) {

		StackImplementation st = new StackImplementation();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
				st.push(ch[i]);

			else	if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {

				if (st.isEmpty()) {
					return false;
				}

				else if (!isMatchingPair((char)st.pop(), ch[i])) {
					return false;
				}
			}

		}

		if (st.isEmpty())
			return true;
		else {
			return false;
		}
	}

	public static int dayOfWeek(int m, int y) {
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	/**
		 *static function to print the prime numbers for the given range
		 * 
		 * @param m the integer that represents the lower bound of the range
		 * @param n the integer that represents the upper bound of the range
		 * @return list of integers that are prime numbers between the range
		 */
		public static ArrayList<Integer> primeNumbers(int m,int n) {
			ArrayList<Integer> lst=new ArrayList<Integer>();
			int temp;

			//swapping of bounds if the given lower bound is greater than upper bound
			if(m>n) {
				temp=m;
				m=n;
				n=temp;}
			int flag=1;
			//try all the possible values from lower bound to upper bound
			//if the number has the factor then it must be checked within lower bound
			for(int i=m;i<=n;i++){
				for(int j=2;j<i;j++){
					//If the number is divisible by any of the number then 
					//initializing flag to zero and break
					//else flag is initialized to one
					if(i%j==0){
						flag=0;
						break;}
					else
						flag=1;}
				//If the number is prime which is indicated by the flag,
				//then adds the number into an ArrayList.
				if(flag==1)
					lst.add(i);}
			return lst;}
		public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }
	 // return true if the given year is a leap year
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }
}


