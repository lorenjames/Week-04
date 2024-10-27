package week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Research {

	
	public static void main(String[] args) {

		List<String> listOfNames = new ArrayList<>();
		
		listOfNames.add("Richard");
		listOfNames.add("Garyn");
		listOfNames.add("Helene");
		listOfNames.add("three");
		listOfNames.add("four");
		//listOfNames.add("five");
		
		System.out.println(listOfNames);
		
		//System.out.println(listOfNames.get(5));
		
		System.out.println(halfTheList(listOfNames));
		
		Map<String,String> input = new HashMap<>();
		
		input.put("Apple", "A fruit on a tree");
		input.put("album", "A record to play");
		
		System.out.println(returnValuesForKeysStartingWithA(input));
		
		Map<String, String> javaDictionary = new HashMap<>();
		
		javaDictionary.put("array", "A Java Object that contains a collection of data items, all of the same type, accessed by an integer index.");
		javaDictionary.put("test", "A Java Object that contains a collection of data items, all of the same type, accessed by an integer index.");
		javaDictionary.put("three", "A Java Object that contains a collection of data items, all of the same type, accessed by an integer index.");
		javaDictionary.put("4array", "A Java Object that contains a collection of data items, all of the same type, accessed by an integer index.");
		javaDictionary.put("5array", "A Java Object that contains a collection of data items, all of the same type, accessed by an integer index.");
		javaDictionary.put("6array", "A Java Object that contains a collection of data items, all of the same type, accessed by an integer index.");
		javaDictionary.put("7array", "A Java Object that contains a collection of data items, all of the same type, accessed by an integer index.");
		
		System.out.println("Number of entries in javaDictionary: " + javaDictionary.size());
		System.out.println(javaDictionary);
		
	}
	
	public static List<String> halfTheList(List<String> listOfNames){
		List<String> resultList = new ArrayList<>();
		
		for (int index = 0; index < listOfNames.size(); index++ ) {
			if (!(index % 2 ==0)) {
				resultList.add(listOfNames.get(index));
			}
			
		}
		
		return resultList;
		
	}
	
	private static List<String> returnValuesForKeysStartingWithA(Map<String,String> dictionary){
		List<String> resultList = new ArrayList<>();
		
		Set<String> keySet = dictionary.keySet();
		
		for(String key : keySet) {
			if(key.toLowerCase().charAt(0) == 'a') {
				resultList.add(dictionary.get(key));
			}
		}
		return resultList;
		
		
	}
	
	
	
	
	
	}
