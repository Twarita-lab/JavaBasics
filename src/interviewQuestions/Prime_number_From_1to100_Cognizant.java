package interviewQuestions;

import java.util.ArrayList;

public class Prime_number_From_1to100_Cognizant {

	public static void main(String[] args) {
		
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for(int i=1; i<=100; i++) {
			int count=0;
			for(int j=1; j<i; j++) {
				if(i%j==0) count++;
			}
			
			if(count<2) primeNumbers.add(i);
		}
		
		System.out.println("list of prime number is "+primeNumbers);
		
		
	}

}
