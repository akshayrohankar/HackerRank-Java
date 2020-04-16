package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();

		sum=A.length()+B.length();

		System.out.println(sum);
		
		
		char[] arrayA = A.toCharArray();
		Arrays.sort(arrayA);
		String tempA = String.valueOf(arrayA);
	//	System.out.println(tempA);
		
		char[] arrayB = B.toCharArray();
		Arrays.sort(arrayB);
		String tempB = String.copyValueOf(arrayB);
	//	System.out.println(tempB);
			
		if(tempA.charAt(0)<tempB.charAt(0)) {
			System.out.println("Yes");
		}else
			System.out.println("No");
		
		
		StringBuilder builder = new StringBuilder();
		A=A.substring(0,1).toUpperCase()+A.substring(1);
		builder.append(A);
	
		B=B.substring(0, 1).toUpperCase()+B.substring(1);
		builder.append(" ");  //appending space between words.
		builder.append(B);
		
		System.out.println(builder);
	}

}
