package concepts;

public class VariablesAndStaticKeyword {

	// Instance variable
	int i;
	int j = 0;
	final int f=8;

	// Class Variable -- same instance used across
	static int c = 0;

	static String n;
	static int si;

	// static block
	static {
		n = "1";
		si = 1;
	}

	public VariablesAndStaticKeyword(int i) {
		c++;
		System.out.println(c);

		j++;
		System.out.println(j);

		//f++; --- gives error as no modification can be done on final variable
		System.out.println(f);

		this.i = i;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesAndStaticKeyword v = new VariablesAndStaticKeyword(0);
		v.print();

		VariablesAndStaticKeyword v2 = new VariablesAndStaticKeyword(5);
		v2.print();

		
		//Calling static methods
		VariablesAndStaticKeyword.staticPrint();

		staticPrint();

	}

	public void print() {
		System.out.println(i);
	}

	public static void staticPrint() {
		System.out.println(c + si);
	}

}
