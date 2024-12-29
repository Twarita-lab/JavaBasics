package concepts;

import helperConcepts.InterfaceDefinition;
import helperConcepts.InterfaceDefinition2;

public class InterfaceImplementation implements InterfaceDefinition, InterfaceDefinition2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementation i = new InterfaceImplementation();
		i.greenGoSignal();
		i.redStopSignal();
		i.yellowSlowDownSignal();
		i.zebraWalk();
		i.walk();
	}

	@Override
	public void greenGoSignal() {
		// TODO Auto-generated method stub
		System.out.println("greenGoSignal implementation");
	}

	@Override
	public void redStopSignal() {
		
	}

	@Override
	public void yellowSlowDownSignal() {
		// TODO Auto-generated method stub
		System.out.println("yellowSlowDownSignal implementation");
		
	}

	@Override
	public void zebraWalk() {
		// TODO Auto-generated method stub
		System.out.println("Zebra walk code");
	}

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walk as you like");
	}

}
