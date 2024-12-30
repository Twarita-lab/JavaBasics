package concepts;

final class FinalClass {
	
	final int fv=1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Final CLASS can not be INHERITED");
		
		FinalClass fc =new FinalClass();
		fc.finalMethod();
	}
	
	final void finalMethod() {
		System.out.println("Final METHOD can not be OVERRIDEN");
		//fv++; can not be done
		System.out.println("Final Variable "+fv+ " can not be MODIFIED");
	}

}
