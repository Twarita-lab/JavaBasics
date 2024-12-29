package concepts;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		int i =1;
		String a = "String";
		
		m.methodName();
		m.methodName(i);
		m.methodName(a);

	}
	
	public void methodName() {
		System.out.println("methodName without Argument");
	}

	public void methodName(int a) {
		System.out.println("methodName with Argument "+ a);
	}

	public void methodName(String a) {
		System.out.println("methodName with Argument "+ a);
	}
}
