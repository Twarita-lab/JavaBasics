package interviewQuestions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_HashTable_Differences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMapName = new HashMap<String, Integer>();
		hashMapName.put("key1", 1);
		hashMapName.put("key2", 1);
		hashMapName.put(null, 1);
		hashMapName.put("key3", null);
		
		
		System.out.println(hashMapName.get("key1"));
		hashMapName.remove("key1");
		System.out.println(hashMapName.get("key1"));
		
		Set convertedHashMap = hashMapName.entrySet();
		Iterator<Integer> is = convertedHashMap.iterator();
		while(is.hasNext()){
			System.out.println(is.next());
		}
		Iterator is2 = convertedHashMap.iterator();
		while(is2.hasNext()){
			Map.Entry<String, Integer> mE = (Map.Entry)is2.next();
			System.out.println(mE.getKey());
			System.out.println(mE.getValue());
		}
		
	
		
		Hashtable<String, Integer> hashTableName = new Hashtable<String, Integer>();
		hashTableName.put("key1", 1);
		hashTableName.put("key2", 1);
		//Below 2 throws error
		//hashTableName.put(null, 1);
		//hashTableName.put("key3", null);
		
		System.out.println(hashTableName.get("key1"));
		hashTableName.remove("key1");
		System.out.println(hashTableName.get("key1"));
		
		Set convertedHashTable = hashTableName.entrySet();
		Iterator<Integer> iht = convertedHashTable.iterator();
		while(iht.hasNext()){
			System.out.println(iht.next());
		}
		Iterator iht2 = convertedHashTable.iterator();
		while(iht2.hasNext()){
			Map.Entry<String, Integer> mE = (Map.Entry)iht2.next();
			System.out.println(mE.getKey());
			System.out.println(mE.getValue());
		}
		
		
		// At a time more than 1 program can access hashMap, but ony 1 thread can access hashTable
		//

	}

}
