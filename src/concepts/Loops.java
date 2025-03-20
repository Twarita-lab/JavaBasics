package concepts;

public class Loops {

	public static void main(String[] args) {
	//fPrint first 5 odd number
		
		int number = 0;
				
		while (number < 10) { //number=0, 1
			number = number + 1; //number = 1, 2

			if (number % 2 > 0) { //1, 
				System.out.println(number); 
			}
		}
		
		System.out.println("-----------------------------------");
		
		for (int no = 0; no<10; no++ ) { 
			if (no % 2 > 0) {  
				System.out.println(no); 
			}
		}


	}

}
