package concepts;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashsetName = new HashSet<String>();
		hashsetName.add("Element1");
		System.out.println(hashsetName);
		
		hashsetName.addAll(hashsetName);
		System.out.println(hashsetName);
		
		System.out.println(hashsetName.containsAll(hashsetName));
		System.out.println(hashsetName.contains("Element "));
		
		System.out.println(hashsetName.equals(hashsetName));
		
		System.out.println(hashsetName.isEmpty());
		
		hashsetName.remove("Element1");
		System.out.println(hashsetName);
		
		hashsetName.add("Element");
		System.out.println(hashsetName);
		hashsetName.clear();
		System.out.println(hashsetName);
		
	}

}
