package strings;

import java.util.Scanner;

public class Anagram {

	//Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. 
	//For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

	static boolean isAnagram(String a, String b) {

		a=a.toLowerCase();
		b=b.toLowerCase();
		
		if(a.length() != b.length()) {
			return false;
		}

		//without built in method
		char[] a1 = SortCharArray(a); 
		char[] b1 = SortCharArray(b);
		

		
		//with build in method
		//Arrays.sort(a1);
		//Arrays.sort(b1);

		for (int i = 0; i < a1.length; i++){
			if (a1[i] != b1[i]) 
				return false; 
		}

		return true;
	}
	
	public static char[] SortCharArray(String input) {
		
		char[] inputArray = input.toCharArray();
		char temp = ' ';
		
		for (int i= 0;  i< inputArray.length; i++) {	
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[j]>inputArray[i]) {
					temp = inputArray[i];
					inputArray[i]=inputArray[j];
					inputArray[j]=temp;
				}
			}
		}
		return inputArray;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}


