package concepts;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		
		try {
			int x = 1/i;
			System.out.println("1 devided by the input i results in "+x);
			
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		finally {
			System.out.println("I am finally block and I had to run");
		}

	}

}
