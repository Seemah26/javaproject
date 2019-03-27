package com.bridgelabz.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Algorithm {

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

			public static boolean isAnagram(char[] str1, char[] str2) 
	    { 
	        // Get lenghts of both strings 
	        int n1 = str1.length; 
	        int n2 = str2.length; 
	  
	        // If length of both strings is not same, 
	        // then they cannot be anagram 
	        if (n1 != n2) 
	            return false; 
	  
	        // Sort both strings 
	        Arrays.sort(str1); 
	        Arrays.sort(str2); 
	       
	  
	        // Compare sorted strings 
	        for (int i = 0; i < n1; i++) 
	            if (str1[i] != str2[i]) 
	                return false; 
	  
	        return true; 
	    }
	
			public static void prime() {
				String primeNumbers =" ";
				for (int i = 0; i <= 1000; i++) {
					int counter = 0;
					for (int j = i; j >= 1; j--) {
						if (i % j == 0) {
							counter = counter + 1;
						}
					}
					if (counter == 2) {
						primeNumbers = primeNumbers + i + " ";
					}
				}

				System.out.println(primeNumbers);
				
			}
			
			public static void primePallindrome() {
				 System.out.println();
				boolean b;
				for (int j = 2; j <= 1000; j++) {
					b = true;
					for (int i = 2; i < j / 2; i++) {
						if (j % i == 0) {
							b = false;
							break;
						}
					}
					if (b && isPallindrome(j))
						System.out.print(j + " ");
				}
			}
			private static boolean isPallindrome(int n) {
				for (int i = 2; i < n / 2; i++) {
					if (i % n == 0) {
						return false;
					}
				}
				return true;
			}
			public static void primeAnagrams() {
				ArrayList<Integer> ar = new ArrayList<Integer>();
				System.out.println();
				boolean b;
				for (int j = 2; j <= 1000; j++) {
					b = true;
					for (int i = 2; i < j / 2; i++) {
						if (j % i == 0) {
							b = false;
							break;
						}
					}
					if (b)
						ar.add(j);
				}
				for (int i = 0; i < ar.size(); i++) {
					for (int j = i + 1; j < ar.size(); j++) {
						if (anagram(ar.get(i), ar.get(j))) {
							System.out.println(ar.get(i) + "  " + ar.get(j));
						}
					}
				}
				
				
				
			}
			private static boolean anagram(Integer n1,Integer n2){
				int[] n1count = count(n1);
				int[] n2count = count(n2);
				for (int i = 0; i < n2count.length; i++) {
					if (n1count[i] != n2count[i]) {
						return false;
					}
				}
				return true;
			}
			
			public static int[] count(int n) {
				int[] count = new int[10];
				int temp = n;
				while (temp != 0) {
					int r = temp % 10;
					count[r]++;
					temp = temp / 10;
				}
				return count;
			}
			public static int binary(String[] arr, String key) {
				{
					 int first = 0;
					 int last = arr.length;
					
					 while (first < last) 
					 {
					 int mid = (first + last) / 2;
					 if (key.compareTo(arr[mid]) < 0)
					 {
					 last = mid;
					 } else if (key.compareTo(arr[mid]) > 0) {
					 first = mid + 1;
					 } else {
					 return mid;
					 }
					 }
					 return -1;
					 }


			}
			public static <T extends Comparable<T>> T[] binary(T[] array, T key){
				int length=array.length;
				int first=0;
				int last=length-1;
				int middle=(first+last)/2;
				while(first<=last)
				{
					if(key.compareTo(array[middle])>0)
				     {
				       first=middle+1;
			          }
					
				else if(array[middle].equals(key))
				{
					System.out.println(key+"-found at location-"+middle);
					break;
				}
				else
				{
					last=middle-1;
				}
			}
				return array;
			}
			public static String[] input1DStringArray(int arraySize) {
				String array[] = new String[arraySize];
				for (int i = 0; i < arraySize; i++) {
					System.out.println("Enter array[" + i + "] : ");
					array[i] = getString();
				}
				return array;

			}

		// Bubble sort
			public static <T extends Comparable<T>> T[] bubble(T[] array) {
				for (int j = 0; j < array.length; j++) {
					for (int i = j + 1; i < array.length; i++) {
						if (array[i].compareTo(array[j]) < 0) {

							T temp = array[j];
							array[j] = array[i];
							array[i] = temp;
						}

					}
				}
				for (int k = 0; k < array.length; k++) {
					System.out.println(array[k]);
				}
				return array;

			}
		// Binary Search for String
			public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
				int first = 0;
				int last = array.length - 1;

				while (first <= last) {
					int mid = (first + last) / 2;
					if (key.compareTo(array[mid]) < 0) {
						last = mid;
					} else if (key.compareTo(array[mid]) > 0) {
						first = mid + 1;
					} else {
						return mid;
					}
				}
				return -1;
			}

		// Insertion sort

			public static <T extends Comparable<T>> T[] inserstionSort(T[] array) {
				for (int i = 1; i < array.length; i++) {
					for (int j = i; j > 0; j--) {
						if (array[j].compareTo(array[j - 1]) < 0) {
							T temp = array[j];
							array[j] = array[j - 1];
							array[j - 1] = temp;
						} else
							break;
					}
				}
				for (int k = 0; k < array.length; k++) {
					System.out.println(array[k]);
				}
				return array;
			}

				
}
