package interviewPrepKit;

import java.io.IOException;
import java.util.Scanner;

public class CountingValley {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		char[] ch = s.toCharArray(); 

		int count = 0;
        int altitude = 0;
        
        for(char c : ch) {
            // Step up
            if(c == 'U') {
                if(altitude == -1) {
                    count++;
                }
                altitude++;
            }
            // Step down
            else {
                altitude--;
            }
        }
		return count;

	}



	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sc.nextLine();

		String s = sc.nextLine();

		int result = countingValleys(n, s);

		System.out.println(result);

	}
}
