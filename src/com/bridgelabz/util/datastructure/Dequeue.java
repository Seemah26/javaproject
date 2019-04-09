package com.bridgelabz.util.datastructure;

import com.bridgelabz.datastructure.UnorderedList;

public class Dequeue<T> {

		UnorderedList<T> deque = new UnorderedList<>();
		public int front = -1;
		public int rear = -1;

		public void addRear(T data) {
			if (rear == -1) {
				front = 0;
				rear = 0;
			}
			deque.add(data);
			rear++;
		}

		public void addfront(T data) {
			if (front == -1) {
				front = 0;
				rear = 0;
			}
			deque.insert(0, data);
			rear++;
		}

		public T removeRear() {
			if (rear == -1) {
				System.out.println("cannot remove");
				return null;
			} else {
				rear--;
				return deque.pop();
			}
		}

		public T removeFront() {
			return deque.pop(0);
		}

		public boolean isEmpty() {
			return deque.isEmpty();
		}

		public int size() {
			return deque.size();
		}

		@Override
		public String toString() {
			return deque.toString();
		}
	}