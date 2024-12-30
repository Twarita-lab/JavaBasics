package concepts;

public class AccessModifiers3{
	
	public static void main(String[] args) {
		
		AccessModifiers1 a2 = new AccessModifiers1();
		System.out.println("deafult can be called by creating object withing package "+a2.default_variable);
		System.out.println("protected can be called by creating object withing package "+a2.protected_variable);
		System.out.println("publlic can be called by creating object withing package "+a2.pubic_variable);
		
		a2.default_method();
		a2.protected_method();
		a2.public_method();
		
	}
}

