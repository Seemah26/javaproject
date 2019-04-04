package com.bridgelabz.datasture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgelabz.datasture.LinkedList.Node;


public class FileReadUnordered {
	/*
	 * static void word(String s1 ,UnorderedList<String> list) {
	 * System.out.println(list.size()); if (list.search(s1)) { list.remove(s1);
	 * System.out.println(list); } }
	 */
	public static void main(String[] args) {
		/*
		 * try and catch block for checking for file related exceptions
		 */
		try {
			// creating a new file
			File f1 = new File("C:\\\\Users\\\\RDRL\\\\Desktop\\\\SearchFile\\\\simmi.txt");
			UnorderedList<String> list = new UnorderedList<>();
			Scanner sf = new Scanner(f1);
			Scanner s = new Scanner(System.in);
			// addind values from file to list
			while (sf.hasNext()) {
				list.add(sf.next());
			}
			// printing list
			System.out.println(list);
			/*
			 * writing to file using file writer
			 */
			FileWriter fw = new FileWriter(f1);
			System.out.println("enter a word ");
			String s1 = s.nextLine();
			System.out.println(list.size());
			// checking if word is found and deleting it and then saving list to file
			if (list.search(s1)) {
				
			deleteByKey(list,s1);
//				list.remove(s1);
//				int n = 0;
//				while (n < list.size()) {
//					fw.write(list.pop(0) + " ");
//					fw.flush();
//					n++;
//			}
				System.out.println("found and deleted");
				// or adding it to list and saving it to file
			} else {
				insert( list, s1) ;
				list.add(s1);
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop(0) + " ");
					fw.flush();
					n++;
				}
				System.out.println("added and saved");
				fw.close();
				s.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io excep");
		}
	}

	private static void insert(UnorderedList<String> list, String s1) {
		// TODO Auto-generated method stub
		
	}

	int data; 
	Node next; 

	// Constructor 
	void Node(int d) 
	{ 
		data = d; 
		next = null; 
	} 
 

// Method to insert a new node 
public static LinkedList insert(LinkedList list, int data) 
{ 
	// Create a new node with given data 
	Node new_node = new Node(data); 
	new_node.next = null; 

	// If the Linked List is empty, 
	// then make the new node as head 
	if (list.head == null) { 
		list.head = new_node; 
	} 
	else { 
		// Else traverse till the last node 
		// and insert the new_node there 
		Node last = list.head; 
		while (last.next != null) { 
			last = last.next; 
		} 

		// Insert the new_node at last node 
		last.next = new_node; 
	} 

	// Return the list by head 
	return list; 
} 

// Method to print the LinkedList. 
public static void printList(LinkedList list) 
{ 
	Node currNode = list.head; 

	System.out.print("LinkedList: "); 

	// Traverse through the LinkedList 
	while (currNode != null) { 
		// Print the data at current node 
		System.out.print(currNode.data + " "); 

		// Go to next node 
		currNode = currNode.next; 
	} 
	
	System.out.println(); 
} 

// **************DELETION BY KEY************** 

// Method to delete a node in the LinkedList by KEY 
public static UnorderedList<String> deleteByKey(UnorderedList<String> list, String s1) 
{ 
	com.bridgelabz.datasture.Node currNode = list.head;
	// Store head node 
	com.bridgelabz.datasture.Node prev = null; 

	// 
	// CASE 1: 
	// If head node itself holds the key to be deleted 

	if (currNode != null && currNode.data == s1) { 
		list.head = currNode.next; // Changed head 

		// Display the message 
		System.out.println(s1 + " found and deleted"); 

		// Return the updated List 
		return list; 
	} 

	// 
	// CASE 2: 
	// If the key is somewhere other than at head 
	// 

	// Search for the key to be deleted, 
	// keep track of the previous node 
	// as it is needed to change currNode.next 
	while (currNode != null && currNode.data != s1) { 
		// If currNode does not hold key 
		// continue to next node 
		prev = currNode; 
		currNode = currNode.next; 
	} 

	// If the key was present, it should be at currNode 
	// Therefore the currNode shall not be null 
	if (currNode != null) { 
		// Since the key is at currNode 
		// Unlink currNode from linked list 
		prev.next = currNode.next; 

		// Display the message 
		System.out.println(s1 + " found and deleted"); 
	} 

	// 
	// CASE 3: The key is not present 
	// 

	// If key was not present in linked list 
	// currNode should be null 
	if (currNode == null) { 
		// Display the message 
		System.out.println(s1 + " not found"); 
	} 

	// return the List 
	return list; 
} 

}