package rS_SDET_InterviewPrep;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		scan.close();
		
		int i=0;
		int a=0;
		int b=1;
		int sum=0;
		
		while(i<no) {
			i++;
			sum=a+b;
			a=b;
			b=sum;
			
			System.out.println(sum);
			
			
		}

	}
}
