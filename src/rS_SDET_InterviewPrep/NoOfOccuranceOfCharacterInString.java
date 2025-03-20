package rS_SDET_InterviewPrep;

import java.util.ArrayList;
import java.util.Scanner;

public class NoOfOccuranceOfCharacterInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		name = name.toLowerCase();
		scan.close();
		
		ArrayList<Object> nameList = new ArrayList<>();
		
		for(char a:name.toCharArray()) {
			if(!nameList.contains(a)) {
				nameList.add(a);
				int count=0;
				for(char b:name.toCharArray()) {
					if(a==b) count++;
				}
				System.out.println(a+" is repeated "+count+" times in name.");
			}
		}
	}
}
