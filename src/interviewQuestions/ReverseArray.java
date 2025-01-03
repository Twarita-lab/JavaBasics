package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,6,3,4,2,6,9};
		Arrays.sort(a);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		
		
		for(int i=a.length-1; i>=0; i--) {
			al.add(a[i]);
		}
		
		
		System.out.println(al.toString());

	}

}
