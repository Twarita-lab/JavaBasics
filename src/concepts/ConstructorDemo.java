package concepts;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("constructor");
	}

	public ConstructorDemo(int a) {
		System.out.println("constructor "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c = new ConstructorDemo();
		ConstructorDemo c1 = new ConstructorDemo(2);
		
	}

}
