package concepts;

public class AccessModifiers2 extends AccessModifiers1{
	
	public static void main(String[] args) {
		
		AccessModifiers2 a2 = new AccessModifiers2();
		System.out.println("deafult can be called by extending withing package "+a2.default_variable);
		System.out.println("protected can be called by extending withing package "+a2.protected_variable);
		System.out.println("publlic can be called by extending withing package "+a2.pubic_variable);
		
		a2.default_method();
		a2.protected_method();
		a2.public_method();
		
	}
}

