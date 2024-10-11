package DataStructure.Interview.com.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheV1 {

	public static void main(String[] args) {

		LRUCache1<Integer,Integer> lrucache=new LRUCache1<Integer, Integer>(2);
		lrucache.addToCache(1, 100);
		lrucache.addToCache(2, 200);
		lrucache.dispalyCacheContent();
		
		lrucache.get(1);
		lrucache.dispalyCacheContent();

		lrucache.addToCache(5, 500);
		lrucache.dispalyCacheContent();

	}

}

class LRUCache1<K, V> {
	Map<K, V> storage;

	int capacity;

	public LRUCache1(int capacity) {
		this.capacity = capacity;

		this.storage = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean removeEldestEntry(Map.Entry<K, V> eldest) {
				return size()>capacity;
			}
		};

	}
	public void addToCache(K k,V v) {
		storage.put(k, v);
	}
	public V readFromCache(K k) {
		return storage.get(k);
	}
	public void dispalyCacheContent() {
		System.out.println(storage.keySet());
	}
	 public V get(K key) {
	        return storage.getOrDefault(key, null);
	    }

}