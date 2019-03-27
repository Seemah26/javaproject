package com.bridgelabz.algorithprograms;

import java.util.ArrayList;

public class PrimePalindromeAnagram {

	public static void main(String[] args) {
		ArrayList<Integer> primenumbers =primeNum();
for(int e:primenumbers)
{
	System.out.println(e);
}
        palindrome(primenumbers);
        System.out.println();
        System.out.println("numbers which are anagrams:");

        primeAnagrams(primenumbers);
    }


// CHECKING NUMBERS FOR PALINDROME AND ANAGRAM

public static void palindrome(ArrayList<Integer> a) {

    System.out.print("Palindrome numbers from 1 to N:");
    for (int i = 0; i < a.size(); i++) {
        int rev = 0;
        int n = a.get(i);
        int m = a.get(i);
        while (n > 0) {
            int b = n % 10;
            rev = rev * 10 + b;
            n = n / 10;

        }
        if (rev == m) {
            System.out.print(rev + " ,");
        }

    }
}

public static void primeAnagrams(ArrayList<Integer> a) {
    for (int i = 0; i < a.size(); i++) {
        for (int j = i + 1; j < a.size(); j++) {
            if (isAnagram(a.get(i), a.get(j))) {
                System.out.println(a.get(i) + " " + a.get(j));
            }
        }
    }
}

// CHECKING ANAGRAMS OF NUMBERS
public static boolean isAnagram(int n1, int n2) {
    int[] num1 = intArray(n1);
    int[] num2 = intArray(n2);
    if (num1.length != num2.length)
        return false;
    else {
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i])
                return false;
        }
    }
	return false;
	}
	


	private static int[] intArray(int n) {
		int[] count=new int[10];
		int temp = n;
		while(temp!=0)
		{
			int r=temp%10;
			count[r]++;
			temp=temp/10;
		}
		return count;
	}


	public static ArrayList<Integer> primeNum() {
	        ArrayList<Integer> ar = new ArrayList<Integer>();
	        for (int i = 0; i < 1000; i++) {
	            int c = 0;
	            for (int j = 1; j <= i; j++) {
	                if (i % j == 0) {
	                    c = c + 1;

	                }
	            }
	            if (c == 2)

	            {
	                ar.add(i);
	            }

	        }
	        return ar;
	    }


}
