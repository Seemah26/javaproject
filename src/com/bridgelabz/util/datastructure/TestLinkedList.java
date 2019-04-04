package com.bridgelabz.util.datastructure;

import java.io.*;
import java.util.LinkedList;

import com.bridgelabz.util.Algorithm;

// Java program to implement 
// a Singly Linked List 
public class TestLinkedList<T> {

	static Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node<T> {

		T data;
		Node next;

		// Constructor
		Node(T d) {
			data = d;
			next = null;
		}

		public T getValue() {
			
			return data;
		}

		public Node<T> getNextRef() {
			return next;
			
			
		}
	}

	// Method to insert a new node
	public TestLinkedList insert(TestLinkedList list, T data) {
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node last = head;
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
	public  Object printList(TestLinkedList list) {
		Node currNode = head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}

		System.out.println();
		return list;
		
	}

	// **************DELETION BY KEY**************

	// Method to delete a node in the LinkedList by KEY
	public  TestLinkedList<String> deleteByKey(TestLinkedList<String> list, T key) {
		// Store head node
		Node<T> currNode = head, prev = null;

		//
		// CASE 1:
		// If head node itself holds the key to be deleted

		if (currNode != null && currNode.data == key) {
			head = currNode.next; // Changed head

			// Display the message
			System.out.println(key + " found and deleted");

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
		while (currNode != null && currNode.data != key) {
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
			System.out.println(key + " found and deleted");
		}

		//
		// CASE 3: The key is not present
		//

		// If key was not present in linked list
		// currNode should be null
		if (currNode == null) {
			// Display the message
			System.out.println(key + " not found");
		}

		// return the List
		return list;
	}

	// **************MAIN METHOD**************

	// method to create a Singly linked list with n nodes
	public static void main(String[] args) throws IOException {
		/* Start with the empty list. */
		TestLinkedList<String> list = new TestLinkedList<String>();

		
		
		File file = new File("C:\\Users\\RDRL\\Desktop\\seema\\soni1.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = " ";
		String st;
				while ((st = bufferreader.readLine()) != null) {
			array = st.split(delimitor);
		}
		for (String k : array) {
			list.insert(list, k);
		}
		 list.printList(list);  

		System.out.println("Enter the key value: ");
		String key = Algorithm.getString();
		list.deleteByKey(list, key);
		
		/*TestLinkedList<String> newList=list.searchKey(list, key);
		     
		
		 FileWriter fw=new FileWriter("C:\\Users\\RDRL\\Desktop\\seema\\soni.txt");    
         String data1 = newList.toString();
		fw.write(data1);  
         //fw.write("Test ");
         fw.close();*/
		
        
	}

/*	private TestLinkedList<String> searchKey(TestLinkedList<String> list, String key) {
		boolean status=false;
		String[] str = new String[100];
		Node<T> tmp = head;
		int k = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			str[k] = String.valueOf(tmp.getValue());
			k++;
			tmp = tmp.getNextRef();
		}
		System.out.println("str[]="+str);
		for (int i = 0; i <str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key))
				status=true;
		}
		if (true) {
			System.out.println("Element is present in the list ");
			//list.deleteByKey(list, key);
		} else {
			System.out.println("Element is not present in the list ");
			list.insert(list, key);
		}
		return  list;
	}*/
	}

