package concepts;

import helperConcepts.AbstractClassDefinition;

public class AbstractMethodImplementation extends AbstractClassDefinition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMethodImplementation  a = new AbstractMethodImplementation();
		a.abstractMethod();
		a.concreteMethod();
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method implemented in class");
	}

}
