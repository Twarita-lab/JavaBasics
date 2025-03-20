package rS_SDET_InterviewPrep;

public class ReverseWithArithmaticOperator {

	public static void main(String[] args) {
		int number = 10;
		int reverse = 0;
		
		while(number!=0) {
			int digit = number %10; // 0, 1
			reverse = digit+reverse*10; //0, 1
			number = number /10; //1, 0
		}
		
		System.out.println(reverse);
	}

}
