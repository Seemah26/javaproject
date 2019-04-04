package com.bridgelabz.datastructure;
import com.bridgelabz.util.datastructure.Datastructure;

public class BalancedParan {
	public static void main(String[] args) {
		System.out.println("Enter expression: ");
		String input = Datastructure.getString();
		char[] ch = input.toCharArray();

		if (Datastructure.areParenthesisBalanced(ch))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}

