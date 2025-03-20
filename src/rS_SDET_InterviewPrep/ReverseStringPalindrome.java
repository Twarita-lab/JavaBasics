package rS_SDET_InterviewPrep;

import java.util.Scanner;

public class ReverseStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String reversedName = "";
		char[] nameCharArray = name.toCharArray();
		
		for(int i=nameCharArray.length-1; i>=0; i--) {
			reversedName=reversedName+nameCharArray[i];
		}
		if(name.equalsIgnoreCase(reversedName)) System.out.println(name + " is a palindrome with reverse string is "+reversedName);
		else System.out.println(name + " is not palindrome and reversed string is "+reversedName);
		scan.close();

	}

}
