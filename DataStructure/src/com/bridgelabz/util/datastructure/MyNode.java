package com.bridgelabz.util.datastructure;


	class MyNode<T> implements Comparable<T> {
	     
	    private T value;
	    private MyNode<T> nextRef;
	     
	    public T getValue() {
	        return value;
	    }
	    public void setValue(T value) {
	        this.value = value;
	    }
	    public MyNode<T> getNextRef() {
	        return nextRef;
	    }
	    public void setNextRef(MyNode<T> ref) {
	        this.nextRef = ref;
	    }
	    @Override
	    public int compareTo(T arg) {
	        if(arg == this.value){
	            return 0;
	        } else {
	            return 1;
	        }

	}

}