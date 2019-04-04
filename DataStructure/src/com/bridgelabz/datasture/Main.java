package com.bridgelabz.datasture;
// A Java prgroam to contrcut all unique BSTs for keys from 1 to n 
import java.util.ArrayList; 
public class Main { 

	// function for constructing trees 
	static ArrayList<Nodenode> constructTrees(int start, int end) 
	{ 
		ArrayList<Nodenode> list=new ArrayList<>(); 
		/* if start > end then subtree will be empty so returning NULL 
			in the list */
		if (start > end) 
		{ 
			list.add(null); 
			return list; 
		} 
	
		/* iterating through all values from start to end for constructing\ 
			left and right subtree recursively */
		for (int i = start; i <= end; i++) 
		{ 
			/* constructing left subtree */
			ArrayList<Nodenode> leftSubtree = constructTrees(start, i - 1); 
	
			/* constructing right subtree */
			ArrayList<Nodenode> rightSubtree = constructTrees(i + 1, end); 
	
			/* now looping through all left and right subtrees and connecting 
				them to ith root below */
			for (int j = 0; j < leftSubtree.size(); j++) 
			{ 
				Nodenode left = leftSubtree.get(j); 
				for (int k = 0; k < rightSubtree.size(); k++) 
				{ 
					Nodenode right = rightSubtree.get(k); 
					Nodenode node = new Nodenode(i);	 // making value i as root 
					node.left = left;			 // connect left subtree 
					node.right = right;		 // connect right subtree 
					list.add(node);			 // add this tree to list 
				} 
			} 
		} 
		return list; 
	} 

	// A utility function to do preorder traversal of BST 
	static void preorder(Nodenode root) 
	{ 
		if (root != null) 
		{ 
			System.out.print(root.key+" ") ; 
			preorder(root.left); 
			preorder(root.right); 
		} 
	} 

	public static void main(String args[]) 
	{ 
		ArrayList<Nodenode> totalTreesFrom1toN = constructTrees(1, 3); 
		/* Printing preorder traversal of all constructed BSTs */
		System.out.println("Preorder traversals of all constructed BSTs are "); 
		for (int i = 0; i < totalTreesFrom1toN.size(); i++) 
		{ 
			preorder(totalTreesFrom1toN.get(i)); 
			System.out.println(); 
		} 
	} 
} 

// node structure 
class Nodenode
{ 
	int key; 
	Nodenode left, right; 
	Nodenode(int data) 
	{ 
		this.key=data; 
		left=right=null; 
	} 
}; 
//This code is contributed by Gaurav Tiwari 
