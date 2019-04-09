package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.datastructure.Datastructure;
public class PrimeAnagram2D {

	public static void main(String[] args) {
	    List<List<Integer>> totalprime = new ArrayList<List<Integer>>();
        List<Integer> primenumbers= new ArrayList<Integer>();
        Set<Integer> PrimeAnagram=new HashSet<Integer>();
        List<Integer> list= new ArrayList<Integer>();
        System.out.print("Prime numbers between 0 to 1000 are");
        primenumbers=Datastructure.primeNumbers(0,1000);
     	System.out.println(primenumbers);
        PrimeAnagram=Datastructure.primeAnagram(primenumbers);
        System.out.print("The size of Prime number which are Anagram  is "+PrimeAnagram.size()+ " And the numbers are" );
        System.out.println(PrimeAnagram);
        list.addAll(PrimeAnagram);
        for(int j=0;j<list.size();j++) 
        {
           if (primenumbers.contains(list.get(j))) {
        	   primenumbers.remove(list.get(j));}
        }
        System.out.print("Total prime number which are not anagram is "+primenumbers.size() +" and the numbers are");
        System.out.print(primenumbers);
        totalprime.add(primenumbers);
    }	
}
