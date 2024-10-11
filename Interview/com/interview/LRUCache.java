package DataStructure.Interview.com.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
	    private LinkedHashMap<K, V> cache;
	    private int capacity;

	    public LRUCache(int capacity) {
	        this.capacity = capacity;
	        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
	            /**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
	            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
	                return size() > capacity;
	            }
	        };
	    }

	    public V get(K key) {
	        return cache.getOrDefault(key, null);
	    }

	    public void put(K key, V value) {
	        cache.put(key, value);
	    }

	    public void display() {
	        System.out.println(cache.keySet());
	    }

	    public static void main(String[] args) {
	        LRUCache<Integer, String> cache = new LRUCache<>(3);

	        cache.put(1, "One");
	        cache.put(2, "Two");
	        cache.put(3, "Three");

	        System.out.println("Initial Cache:");
	        cache.display(); // [1, 2, 3]

	        cache.get(1); // Accessing key 1, making 2 and 3 less recently used

	        System.out.println("After Accessing 1:");
	        cache.display(); // [2, 3, 1]

	        cache.put(4, "Four"); // Adding a new element, evicting key 2

	        System.out.println("After Adding 4 (evicting 2):");
	        cache.display(); // [3, 1, 4]
	    }
	}

