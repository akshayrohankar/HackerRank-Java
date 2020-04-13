package interviewPrepKit;

import java.util.ArrayList;
import java.util.List;

public class MissingDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultFinal = 0;
		int digitsCount = 0;
	

		int temp = 861;


		// convert int to int array.
		List<Integer> array = new ArrayList<Integer>();

		while (temp > 0) {
			array.add(temp % 10);
			temp /= 10;
		}

		System.out.println(array);
		//System.out.println(array.get(2));
		
		//array.add(0, 0);
		//System.out.println(array);
		digitsCount = array.size();
		System.out.println(digitsCount);

		resultFinal=doubleValueOperation(array,digitsCount);
		
		System.out.println("Result "+resultFinal);

	}

	public static int doubleValueOperation(List<Integer> array, int digitsCount) { 
		// t--->number of test cases 
		// numbers each containing d digits.
																
		int temp = 0;
		boolean isDoubleDigit = false;
		// List<Integer> doubleIntValues = new ArrayList<Integer>();
		int sumArray = 0;

		for (int i = 0; i < digitsCount; i++) {
			if (i % 2 == 0) {
				//array[i] *= 2;
				
				array.add(i, array.get(i)*2);
				isDoubleDigit = (array.get(i) > 9 && array.get(i) < 100);

				if (isDoubleDigit) {
					temp += getSum(array.get(i));
				}
			} else {
				sumArray += array.get(i);
			}
		}

		return temp + sumArray;

	}

	static int getSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}

		return sum;
	}

}



//OUTPUT
/*
 * [9, 8, 7, 6, 5, 4, 3, 2, 1] 7 [0, 9, 8, 7, 6, 5, 4, 3, 2, 1] 10 Result 51
 */