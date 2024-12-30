package concepts;

public class AccessModifiers1 {
	
	private int private_variable = 1;
	int default_variable = 1;
	protected int protected_variable = 1;
	public int pubic_variable = 1;
 
	public static void main(String[] args) {
		
		

	}
	
	private void private_method() {
		System.out.println("private_method of AccessModifiers1 class of concepts package");
	}

	void default_method() {
		System.out.println("default_method of AccessModifiers1 class of concepts package");
	}
	protected void protected_method() {
		System.out.println("protected_method of AccessModifiers1 class of concepts package");
	}

	public void public_method() {
		System.out.println("public_method of AccessModifiers1 class of concepts package");
	}
}
