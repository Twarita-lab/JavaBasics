package rS_SDET_InterviewPrep;

import java.util.Scanner;

public class MultiplicationWOMultiplyOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int times = scan.nextInt();
		int result=0;
		
		scan.close();
		
		//Printing number's multiplication table till given times
		for(int i=0; i<times; i++) {
			result=result+number;
			System.out.println(number+"*"+(i+1)+" = "+result);

		}
		
		//Printing multiplication of number's and times
		
		System.out.println(number+"*"+times+" = "+result);

		
	}

}
