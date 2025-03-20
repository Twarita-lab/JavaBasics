package rS_SDET_InterviewPrep;

import java.util.ArrayList;

public class EleminateDuplicatesPrintUniqueNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,2,3,9,0,12,4,9};
		ArrayList<Integer> aL = new ArrayList<>();
		
		//Method 1
		for(int i=0; i<a.length; i++) {
			if(!aL.contains(a[i])) {
				aL.add(a[i]);
			}
		}
		System.out.println(aL.toString());
		
	}
}
