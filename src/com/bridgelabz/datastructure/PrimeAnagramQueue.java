package com.bridgelabz.datastructure;


import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.datastructure.Datastructure;

import com.bridgelabz.util.datastructure.QueueLinkedList;
public class PrimeAnagramQueue {
	
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using queue
	*/
	public static void main(String[] args) {
		  	//List<Integer> list = new ArrayList<Integer>();
		  	List<Integer> list=new ArrayList<Integer>();
		  	//Customized Queue
		  	QueueLinkedList<Integer> queue=new QueueLinkedList<Integer>();
		  	
		    //Method 1- using function of AlgorithmUtility class of
			//com.bridgelabz.util package
	        list = Datastructure.primeNumbers(0,1000);
	        
	        for(int i=0;i<list.size();i++){
				  for(int j=i+1;j<list.size();j++){
					  
					//Method 2- using function of AlgorithmUtility class of
					//com.bridgelabz.util package
					  if(Datastructure.isAnagram(String.valueOf(list.get(i)),String.valueOf( list.get(j)))){
						  
						//Method 3- using function of Queue class of
						//com.bridgelabz.util package
						  queue.insert(list.get(i));
						  queue.insert(list.get(j));
					}
				}
			}
	        System.out.println("Elements in a queue are :");
	        
	        //Method 4- using function of Queue class of
			//com.bridgelabz.util package
	        queue.display();
	}
}