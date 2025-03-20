package interviewQuestions;

import java.util.Scanner;

public class ReverseString_HCLL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String output = "";
		
		//Takes too much memory
		char[] inputArray = input.toCharArray();
		
		for(int i=inputArray.length; i>0; i--) {
			output=output+inputArray[i-1];
		}
		System.out.println(output);
		//This solution is much space efficient and faster, though not thread safe
		StringBuilder iSB = new StringBuilder(input);
		System.out.println(iSB.reverse());
		
		//This solution is space efficient and thread safe, but slow
		StringBuffer iSBf = new StringBuffer(input);
		System.out.println(iSBf.reverse());
		
		scan.close();
	}

}
