package rS_SDET_InterviewPrep;

public class MinMaxOfTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,4},{2,5},{1,6},{7,9}};
		
		int row=a.length;
		int col = a[0].length;
		
		System.out.println(row+" "+col);
		
		int min=a[0][0];
		int max=a[0][0];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(a[i][j]<min) min=a[i][j];
				else if (a[i][j]>max) max=a[i][j];
			}
		}
		System.out.println("Minimum is "+min+" and Maximum is "+max);

	}

}
