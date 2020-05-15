package strings;

public class SortCharArray {

	public static void main(String[] args) {
		
		String input = "Acerb";
		char[] inputArray = input.toCharArray();
		System.out.println(inputArray);
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
		System.out.println(inputArray);
	}
}
