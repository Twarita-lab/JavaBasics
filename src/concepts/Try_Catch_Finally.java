package concepts;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		int b = 2;
		
		try {
			int x = a/b;
			System.out.println(a+" devided by the input "+b+" results in "+x);
			
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException "+a+" devided by "+b);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		finally {
			System.out.println("I am finally block and I had to run");
		}

	}

}
