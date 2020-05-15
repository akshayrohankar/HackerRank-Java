package strings;

import java.util.Scanner;

public class StringToken {
	
			//Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
			//We define a token to be one or more consecutive English alphabetic letters. 
			//Then, print the number of tokens, followed by each token on a new line.
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        
	        //He is a very very good boy, isn't he? 
	        s=s.trim();
	        String[] tokenArray = s.split("[ !,?._'@]+");
	        
	        if(s.length() == 0){
	            System.out.println("0");
	         }
	         else if(s.length() > 400000){
	             return;
	         }
	         else{
	        	 System.out.println(tokenArray.length);
	         }
	    
	        for(String token: tokenArray) {
	        	System.out.println(token);
	        }
	        scan.close();
	}

}
