package interviewQuestions;

public class MaxOfMinNumberRowFromMultiDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{2,3,4},{3,-5,7},{1,4,6}, {1,9,6}};
		
		int minNumber = a[0][0];
		int columnNoOfMinNumber = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				if(a[i][j]<minNumber) {
					minNumber=a[i][j];
					columnNoOfMinNumber=j;
				}
				
			}
		}
		
		int maxNumber = minNumber;
		for(int i=0; i<a.length; i++) {
			if(maxNumber<a[i][columnNoOfMinNumber]) maxNumber = a[i][columnNoOfMinNumber];
		}
		
		System.out.println("Smallest number of multidimestional array a is "+minNumber);
		System.out.println("Biggest number of the Column, where Minimum number is present is "+maxNumber);
	}

}
