package interviewQuestions;

public class MinFromMultiDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{2,3,4},{3,-5,7},{1,4,6}};
		
		int minNumber = a[0][0];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				if(a[i][j]<minNumber) minNumber=a[i][j];
			}
		}
		
		System.out.println("Smallest number of multidimestional array a is "+minNumber);

	}

}
