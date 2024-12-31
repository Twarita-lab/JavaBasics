package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimesSameElementRepeatedInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,5,6,4,2,7,6,3,2,1};
		
		List<Integer> aL = new ArrayList<>();
		List<Integer> uniqueArray = new ArrayList<>();
		
		
		for(int i=0; i<a.length; i++) {
			int count =1;
			if(!aL.contains(a[i])) {
				aL.add(a[i]);
				for(int j=i+1; j<a.length; j++) {
					if(a[j]==a[i]) count++;
				}
				System.out.println(a[i] +" present in the Array "+count+" times");
				if(count==1) uniqueArray.add(a[i]);
			}
		}
		
		System.out.println(uniqueArray.toString());

	}

}
