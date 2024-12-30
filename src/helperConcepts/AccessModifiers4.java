package helperConcepts;

import concepts.AccessModifiers1;

public class AccessModifiers4 extends AccessModifiers1{
	
	public static void main(String[] args) {
		
		AccessModifiers4 a2 = new AccessModifiers4();
		System.out.println("protected can be called by extending the claass outside package "+a2.protected_variable);
		System.out.println("public can be called by extending the claass outside  package "+a2.pubic_variable);
		
		a2.protected_method();
		a2.public_method();
		
	}
}

