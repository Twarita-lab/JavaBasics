package concepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrayListName = new ArrayList<String>();
		System.out.println(arrayListName);
		arrayListName.add("Element1");
		System.out.println(arrayListName);
		arrayListName.add(0, "Element2");
		System.out.println(arrayListName);
		arrayListName.addAll(arrayListName);
		System.out.println(arrayListName);
		System.out.println(arrayListName.contains("Element1"));
		System.out.println(arrayListName.equals(arrayListName));
		System.out.println(arrayListName.containsAll(arrayListName));
		System.out.println(arrayListName.get(0));
		System.out.println(arrayListName.indexOf("Element1"));
		System.out.println(arrayListName.isEmpty());
		System.out.println(arrayListName.lastIndexOf("Element1"));;
		arrayListName.remove("Element1");
		System.out.println(arrayListName);
		arrayListName.set(2, "Element3");
		System.out.println(arrayListName);
		System.out.println(arrayListName.size());
		
		arrayListName.clear();
		System.out.println(arrayListName);
		
		
	}

}
