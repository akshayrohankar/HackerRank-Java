package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	//Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. 
	//For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
//kk
	static boolean isAnagram(String a, String b) {

		if(a.length() != b.length()) {
			return false;
		}

		char[] a1 = a.toCharArray(); 
		char[] b1 = b.toCharArray(); 

		Arrays.sort(a1);
		Arrays.sort(b1);

		for (int i = 0; i < a1.length; i++){
			if (a1[i] != b1[i]) 
				return false; 
		}

		return true;
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


