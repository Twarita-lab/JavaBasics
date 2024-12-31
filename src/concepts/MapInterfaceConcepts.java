package concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMapName = new HashMap<String, Integer>();
		hashMapName.put("key1", 1);
		hashMapName.put("key2", 1);
		
		System.out.println(hashMapName.get("key1"));
		hashMapName.remove("key1");
		System.out.println(hashMapName.get("key1"));
		
		Set convertedHashMap = hashMapName.entrySet();
		Iterator<Integer> is = convertedHashMap.iterator();
		while(is.hasNext()){
			System.out.println(is.next());
		}
		
		HashMap<String, Integer> hashMapName2 = new HashMap<String, Integer>();
		hashMapName2.put("key1", 1);
		hashMapName2.put("key2", 1);
		Set convertedHashMap2 = hashMapName2.entrySet();
		Iterator is2 = convertedHashMap2.iterator();
		while(is2.hasNext()){
			Map.Entry<String, Integer> mE = (Map.Entry)is2.next();
			System.out.println(mE.getKey());
			System.out.println(mE.getValue());
		}
	}

}
