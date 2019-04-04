package com.bridgelabz.datasture;

public class NodeA {
	public NodeA nextNode;
	public int data;
	public NodeA() {
	}
 public NodeA(int val){
	 data=val;
 }
 public NodeA(int val,NodeA next) {
	 data=val;
	 nextNode=next;
 }
 public void setData(int val) {
	 this.data=val;	 
 }
 public int getData() {
	 return this.data;
 }
 public void setNextNode(NodeA n) {
	 this.nextNode=n;
 }
 public NodeA getNextNode() {
	 return this.nextNode;
 }
}
