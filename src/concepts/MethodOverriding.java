package concepts;

import helperConcepts.ParentClass;

public class MethodOverriding extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m = new MethodOverriding();
		m.parentClassMethod();
		
		ParentClass p = new MethodOverriding();
		p.parentClassMethod();

	}
	
	public void parentClassMethod() {
		System.out.println("parentClassMethod defined in child class");
	}

}
