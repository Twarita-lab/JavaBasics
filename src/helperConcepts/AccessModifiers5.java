package helperConcepts;

import concepts.AccessModifiers1;

public class AccessModifiers5{
	
	public static void main(String[] args) {
		
		AccessModifiers1 a2 = new AccessModifiers1();
		System.out.println("public can be called by creating object of the claass outside package "+a2.pubic_variable);
		
		a2.public_method();
		
	}
}

