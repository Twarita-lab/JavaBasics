package rS_SDET_InterviewPrep;

public class MaxDiffBetwnAdjasentElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,6,9,2,0,1,5,7,8,9,10,2,4,40};
		int difference = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(difference<Math.abs(arr[i]-arr[i+1])) difference=Math.abs(arr[i]-arr[i+1]);
			
		}
		System.out.println(difference);

	}

}
