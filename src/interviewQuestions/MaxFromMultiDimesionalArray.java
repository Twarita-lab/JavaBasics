package interviewQuestions;

public class MaxFromMultiDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{2,3,4},{3,-5,7},{1,4,6}};
		
		int maxNumber = a[0][0];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				if(a[i][j]>maxNumber) maxNumber=a[i][j];
			}
		}
		
		System.out.println("Biggest number of multidimestional array a is "+maxNumber);

	}

}
