package com.bridgelabz.util.datastructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SinglyLinkedListImpl<T> {
 
    private MyNode<T> head;
    private MyNode<T> tail;
     
    public ArrayList<String> add(T element) throws IOException{
         
        MyNode<T> nd = new MyNode<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        String str = (String) element;
//        Scanner file = new Scanner(new File("C:\\Users\\RDRL\\Desktop\\SearchFile\\File.txt"));
//       String r = file.toString();
//        ArrayList<String> list=new ArrayList<String>();
//        BufferedWriter writer = new BufferedWriter(new FileWriter("File.txt"));
//       
//        writer.write(str);
//        FileReader l=new FileReader( r );
//        System.out.println(l);
        /**
         * check if the list is empty
         */
        if(head == null){
            //since there is only one element, both head and 
            //tail points to the same object.
            head = nd;
            tail = nd;
           
        } else {
            //set current tail next link to new node
            tail.setNextRef(nd);
            //set tail as newly created node
            tail = nd;
                    }
		return null;
		
    }
     
    public void addAfter(T element, T after){
         
        MyNode<T> tmp = head;
        MyNode<T> refNode = null;
        System.out.println("Traversing to all nodes..");
        /**
         * Traverse till given element
         */
        while(true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }
        if(refNode != null){
            //add element after the target node
            MyNode<T> nd = new MyNode<T>();
            nd.setValue(element);
            nd.setNextRef(tmp.getNextRef());
            if(tmp == tail){
                tail = nd;
            }
            tmp.setNextRef(nd);
             
        } else {
            System.out.println("Unable to find the given element...");
        }
    }
     
    public void deleteFront(){
         
        if(head == null){
            System.out.println("Underflow...");
        }
        MyNode<T> tmp = head;
        head = tmp.getNextRef();
        if(head == null){
            tail = null;
        }
        System.out.println("Deleted: "+tmp.getValue());
    }
     
    public void deleteAfter(T after){
         
        MyNode<T> tmp = head;
        MyNode<T> refNode = null;
        System.out.println("Traversing to all nodes..");
        /**
         * Traverse till given element
         */
        while(true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }
        if(refNode != null){
            tmp = refNode.getNextRef();
            refNode.setNextRef(tmp.getNextRef());
            if(refNode.getNextRef() == null){
                tail = refNode;
            }
            System.out.println("Deleted: "+tmp.getValue());
        } else {
            System.out.println("Unable to find the given element...");
        }
    }
     
    public void traverse(){
         
        MyNode<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.println(tmp.getValue());
            tmp = tmp.getNextRef();
        }
    }
     
   
}
 

