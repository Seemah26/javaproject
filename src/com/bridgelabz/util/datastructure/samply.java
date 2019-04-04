package com.bridgelabz.util.datastructure;

public class samply {

	public static void main(String[] args) {
		
			/* Start with the empty list. */
			TestLinkedList<String> list = new TestLinkedList<String>(); 

			// 
			// ******INSERTION****** 
			// 

			
			String data="hey how are you";
			// Print the LinkedList 
			list.insert(list, data) ;
			list.insert(list, "hi");
			list.printList(list);
			System.out.println("enter key to search");
			String n=Datastructure.getString();
			list=list.insert(list, n);
			list.printList(list);
			
		} 
	

	}

