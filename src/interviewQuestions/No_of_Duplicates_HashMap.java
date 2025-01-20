package interviewQuestions;

import java.util.HashMap;

public class No_of_Duplicates_HashMap {

	public static void main(String[] args) {
		
		int[] x = {1,3,2,6,4,0,3,9,1,6};
		HashMap<Integer, Integer> repetationCounter = new HashMap<Integer, Integer>();
		
		for(int i=0; i<x.length; i++) {
			if(!repetationCounter.containsKey(x[i])) {
				int count=1;
				
				for(int j=i+1; j<x.length; j++) {
					if(x[i]==x[j]) count++;
				}
				repetationCounter.put(x[i], count);
			}
		}
		
		System.out.println(repetationCounter);
		
		
	}

}
