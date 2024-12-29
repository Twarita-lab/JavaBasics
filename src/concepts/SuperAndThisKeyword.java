package concepts;

import helperConcepts.ParentClass;

public class SuperAndThisKeyword extends ParentClass{
	
	public SuperAndThisKeyword() {
		super();
		System.out.println("constructor of SuperAndThisKeyword class");
	}
	//Instance Variable
	String className = "SuperAndThisKeyword";
	
	
	public void getClassName() {
		//Local variable
		String className = "getClassName";
		System.out.println("Calling Parent class's vriable using super keyword "+super.className);
		System.out.println("Calling local vriable "+className);
		System.out.println("Calling class's vriable using this keyword "+this.className);
		super.getClassName();
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAndThisKeyword s = new SuperAndThisKeyword();
		s.getClassName();
		
			}

}
