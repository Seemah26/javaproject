package com.bridgelabz.util.datastructure;

public class SinglyLinkedList<T> {
	public Node<T> head;
	public Node<T> tail;
	public int size = 0;
	static String[] str = new String[100];
	static SinglyLinkedList<String> newList = new SinglyLinkedList<String>();

	public boolean isEmpty() {
		return head == null;
	}
	public String addElement(T key) {
		Node<T> nd = new Node<T>();
		nd.setValue(key);
		size++;

		/**
		 * check if the list is empty
		 */
		if (isEmpty()) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNextRef(nd);
			// set tail as newly created node
			tail = nd;
		}
		return null;
	}

	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}

	}

	@Override
	public String toString() {
		Node<T> temp = head;
		String elements = "";
		while (temp.getNextRef() != null) {
			elements += " "+ temp.getValue() +" ";
			temp = temp.getNextRef();
		}
		return elements + temp.getValue();
	}

	public void get() {

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
	}

	public SinglyLinkedList<T> searchKey(SinglyLinkedList<T> list, String key) {
		Node<T> current = head;
		boolean status = false;

		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key)) {
				status = true;
				str[i] = null;
				current = current.getNextRef();
				break;
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null)
				newList.addElement(str[i]);
		}
		if (status) {
			System.out.println("Element is present in the list ");
		} else {
			System.out.println("Element is not present in the list ");
			newList.addElement(key);
		}
		return (SinglyLinkedList<T>) newList;
	}
	 static String[] bubbleSort(String[] array) {
			for (int j = 0; j < array.length; j++) {
				for (int i = j + 1; i < array.length; i++) {
					// comparing strings
					if (array[i].compareTo(array[j]) < 0) {

						String temp = array[j];
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
}