package com.bridgelabz.datasture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.util.datastructure.SinglyLinkedListImpl;

public class UnorderedList<T> {
	 public static void main(String[] args) throws FileNotFoundException {
		 String word =  "";
	        int val = 0;
	        while (!((String) word).matches("quit")) {
	            System.out.println("Enter the word to be searched for");
	            Scanner input = new Scanner(System.in);
	            word =  input.next();
	            
	            Scanner file = new Scanner(new File("C:\\Users\\RDRL\\Desktop\\SearchFile\\File.txt"));
	            ArrayList<String> list=new ArrayList<String>();
          SinglyLinkedListImpl<String> ref=new SinglyLinkedListImpl<String>();
	            while (file.hasNextLine()) {
	                String line = file.nextLine();
	                if (line.indexOf( word) != -1) {
	                    System.out.println("Word EXISTS in the file");
	                    
	                    val = 1;
	                    break;
	                } else {
	                    val = 0;
	                    continue;
	                }
	            }
	            if(val==0) {
	            	try {
						ref.add(word);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            	
	            	//writeStringToFile(file, word);
	            }
	            
	 }
}

	
}


