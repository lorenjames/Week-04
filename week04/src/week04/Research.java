package week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Research {

	
	public static void main(String[] args) {


		  LinkedList<String> line = new LinkedList<String>();
	        line.add("Amanda");
	        line.add("Brad");
	        line.add("Cori");
	      
	        System.out.println("People in line: " + line);
	        System.out.println("First person in line was: " + line.get(0));
	        System.out.println("The last person in line was: " + line.get(2));
	          
	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
	          
	        // WRITE YOUR CODE HERE
	        
	        line.remove(0);
	        line.add("Danny");
	        
	        
	    
	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	        System.out.println("People in line now: " + line);
	        System.out.println("Now the first person in line is: " + line.get(0));
	        System.out.println("The last person in line is: " + line.get(2));
	    }
	}
