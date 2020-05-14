package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);
		String A=sc.next();
		
		
		
		StringBuffer sb = new StringBuffer(A);
		
		
		if(A.contentEquals(sb.reverse()) && A.length()<=50) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
