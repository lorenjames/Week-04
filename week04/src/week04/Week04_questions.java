package week04;

import java.util.ArrayList;
import java.util.List;

public class Week04_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.add(null);
		sports.remove(1);
		
		for(int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		/*
		 * List<int> numbers = new ArrayList<int>(); Cannot use primitive data types in
		 * array list
		 */
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		
		
		
		

	}
	
}
	
	

