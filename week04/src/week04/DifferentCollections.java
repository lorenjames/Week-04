package week04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DifferentCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				
		/*
		 * List 
		 * 
		 * allows for duplicates 
		 * keeps elements ordered by index 
		 * allows null
		 * values common implementations; ArrayList, LinkedList, Vector
		 */
				
				
				List<String> students = new ArrayList<String>();
				students.add("Rob");
				students.add("Rob");
				students.add("Sam");
				students.add(null);
				
				for (String student : students) {
					System.out.println(student);
				}
				
				System.out.println(students.get(2)); //Sam
				System.out.println(students.get(0)); //Rob
				
				
				/* Set 
				 * 
				 * No duplicates
				 * Unordered
				 * allows null
				 * common implementations: HashSet, LinkedHashSet, TreeSet
				 * */
				
				Set<String> states = new HashSet<String>();
				states.add("Alabama");
				states.add("Alaska");
				states.add("Arizona");
				states.add("Arkansas");
				states.add("California");
				states.add(null);
				
				System.out.println(states.size());
				System.out.println(states.contains("Alabama"));
				
				if(states.contains("Alabama")) {
					states.remove("Alabama");
				}
				
				for (String state : states) {
					System.out.println(state);
				}
				
				
				/* Map 
				 * 
				 * Map<K, V> K is the key, V is the value
				 * 
				 * key value pairs (dictionary)
				 * values can be duplicated but not keys
				 * Common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
				 * */
				
				Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
				racerPlacements.put(1, "Tommy");
				racerPlacements.put(2, "Sally");
				racerPlacements.put(3, "John");
				
				System.out.println(racerPlacements.get(1));
				
				racerPlacements.remove(1);
				
				Set<Integer> racerKeys = racerPlacements.keySet();
				
				for(Integer key : racerKeys) {
					System.out.println(key + " : " + racerPlacements.get(key));
				}
				
				Collection<String> racers = racerPlacements.values();
				for (String racer : racers) {
					System.out.println(racer);
				}
				
				Map<String, String> dictionary = new HashMap<String, String>();
				dictionary.put("Augment", "make (something) greater by adding to it; increase.");
				dictionary.put("Diminish", "make or become less.");
				dictionary.put("Ostentatious", "characterized by vulgar or pretentious display; designed to impress or attract notice.");
				
				
				
				
				
				
				
			}
	


	}


