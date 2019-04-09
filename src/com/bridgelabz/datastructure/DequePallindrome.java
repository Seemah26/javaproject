package com.bridgelabz.datastructure;

import com.bridgelabz.util.datastructure.Dequeue;
import com.bridgelabz.util.datastructure.SinglyLinkedList;

public class DequePallindrome {
	public static void main(String[] args) {

		Dequeue<Character> dq = new Dequeue<Character>();

		System.out.println("Enter a String: ");
		String s = SinglyLinkedList.userString();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			dq.addfront(ch[i]);
		}
		int flag = 0;
		while (dq.size() > 1) {

			if (dq.removeFront() != dq.removeRear()) {

				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
