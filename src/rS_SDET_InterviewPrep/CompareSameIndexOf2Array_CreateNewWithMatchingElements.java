package rS_SDET_InterviewPrep;

import java.util.ArrayList;

public class CompareSameIndexOf2Array_CreateNewWithMatchingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,5,6,9,2,0,1,5,7,8,9,10,2,4,40};
		int[] arr2 = {1,5,6,2,0,1,5,8,8,9,1,2,4,1,40};
		int length=0;
		
		if(arr1.length<arr2.length) length = arr1.length;
		else length = arr2.length;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		
		for(int i=0; i<length; i++) {
			if(arr1[i]==arr2[i]) arr.add(arr1[i]);
		}
		System.out.println(arr.toString());
	}

}
