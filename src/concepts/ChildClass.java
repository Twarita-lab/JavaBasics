package concepts;

import helperConcepts.ParentClass;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
		ParentClass pc = new ChildClass(); //Same as ParentClass p = new ParentClass();
		pc.parentClassMethod();
		
		ChildClass c = new ChildClass();
		c.childClassMethod();
		c.parentClassMethod();
		
		//Can not be done
		//ChildClass cp = new ParentClass();
		
	}
	public void childClassMethod() {
		System.out.println("childClassMethod");
	}

}
