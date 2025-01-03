package interviewQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String output = "";
		
		
		char[] inputArray = input.toCharArray();
		
		for(int i=inputArray.length-1; i>=0; i--) {
			output=output+inputArray[i];
		}
		System.out.println(output);
		scan.close();
	}

}
