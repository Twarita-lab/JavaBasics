package rS_SDET_InterviewPrep;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		SumOfArray sumOfArray = new SumOfArray();
		
		System.out.println(sumOfArray.returnSumOfArrayMethod(arr));
		
	}
	
	public int returnSumOfArrayMethod(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	

}
