package concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashsetName = new HashSet<String>();
		hashsetName.add("Element1");
		hashsetName.add("Element2");
		hashsetName.add("Element4");
		Iterator<String> ihN = hashsetName.iterator();
		while(ihN.hasNext()) {
		
		System.out.println(ihN.next());
		

	}

		List<String> arrayListName = new ArrayList<String>();
		arrayListName.add("Element1");
		arrayListName.add("Element2");
		
		Iterator<String> iAn = arrayListName.iterator();
		while(iAn.hasNext()) {
		
		System.out.println(iAn.next());
		

	}
}
}