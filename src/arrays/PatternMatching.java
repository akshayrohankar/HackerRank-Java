package arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		
		 // Create a pattern to be searched 
        Pattern pattern = Pattern.compile("g"); 
  
        // Search above pattern in "geeksforgeeks.org" 
        Matcher m = pattern.matcher("geeksforgeeks.org"); 
  
        // Print starting and ending indexes of the pattern 
        // in text 
        while (m.find()) 
            System.out.println("Pattern found from " + m.start() + 
                               " to " + (m.end()-1));
	}

}
