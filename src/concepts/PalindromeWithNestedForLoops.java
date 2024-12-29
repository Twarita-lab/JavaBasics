package concepts;

public class PalindromeWithNestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		for(int i=4; i>0; i--) { 
			for(int j=0; j<i; j++) { 
				count=count+1;  
				System.out.print(count);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println(" ");
		
		count = 0;
		
		for(int i=1; i<5; i++) { 
			for(int j=0; j<i; j++) { 
				count=count+1;  
				System.out.print(count);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println(" ");
		
		count=0;
		for(int i=1; i<4; i++) { 
			for(int j=0; j<i; j++) { 
				count=count+3;  
				System.out.print(count);
				System.out.print("\t");
				
			}
			System.out.println();
		}

	}

}
