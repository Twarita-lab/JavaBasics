package rS_SDET_InterviewPrep;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		boolean prime = false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = true;
				break;
			}

		}
		if (prime == true)
			System.out.println("Given number is prime");
		else
			System.out.println("Given number is not prime");

	}

}
