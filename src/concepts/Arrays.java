package concepts;

public class Arrays {

	public static void main(String[] args) {
		// Method 1
		//dataType arrayName[] = new dataType[size]
		int[] a = new int[5];
		a[0]=1;
		a[4]=5;
		
		System.out.println("Size of array "+a.length);
		
		for(int i:a) System.out.print(i+"\t");
		
		System.out.println(" ");
		
		//Method 2: ArrayLiteral
		//dataType[] name = {value1, value2,.....};
		int[] b = {1,2,3,4,5};
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println(" ");
		// Method 1 - Multidimensional Array
		//dataType[][] arrayName = new dataType[sizeRow][sizeColumn]
				int[][] c = new int[2][3];
				c[0][0]=1;
				c[0][1]=2;
				c[0][2]=3;
				c[1][0]=4;
				c[1][1]=5;
				c[1][2]=6;
				
				
				System.out.println("Size of array "+c.length);
				
				for(int i=0; i<c.length; i++) {
					for(int j=0; j<3; j++) {
						System.out.print(c[i][j]+"\t");
						}
					System.out.println(" ");
					
					}

	}

}
