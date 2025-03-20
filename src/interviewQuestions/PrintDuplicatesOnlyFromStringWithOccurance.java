package interviewQuestions;

import java.util.HashMap;

public class PrintDuplicatesOnlyFromStringWithOccurance {

	public static void main(String[] args) {
		String name = "Twarita";

		HashMap<Character, Integer> nameMap = new HashMap<>();

		for (int i = 0; i < name.length(); i++) {
			if (!nameMap.containsKey(name.charAt(i))) {
				int count = 0;
				for (int j = i; j < name.length(); j++) {
					if (name.charAt(i) == name.charAt(j)) {
						count++;
					}

				}
				nameMap.put(name.charAt(i), count);
			}
		}
		System.out.println(nameMap);

		nameMap.entrySet().stream().filter(a -> a.getValue() > 1).forEach(a -> System.out.println(a.getKey()));
	}

}
