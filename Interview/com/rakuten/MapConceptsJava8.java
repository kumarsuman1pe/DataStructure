package DataStructure.Interview.com.rakuten;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapConceptsJava8 {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "Suman");
		hm.put(5, "Rahul");
		hm.put(2, "Ashish");

		hm.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.forEach(e -> System.out.println(e.getValue()));
		
		
		Map<String, String> hm1 = new HashMap<>();
		hm1.put("1", "Suman");
		hm1.put("5", "Rahul");
		hm1.put("2", "Ashish");

		hm1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.forEach(e -> System.out.println(e.getValue()));
	}
}
