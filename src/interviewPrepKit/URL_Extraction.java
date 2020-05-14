package interviewPrepKit;

public class URL_Extraction {

	public static void main(String[] args) {

		String line = "This is my url https://www.google.com use this for your projects This is my url https://www.yahoo.com use this for your projects";
		String[] wordsArray = line.split(" ");

		for(int i=0; i<wordsArray.length; i++) {

			if(wordsArray[i].contains("://")) {
				//System.out.println(wordsArray[i]); // url

				String[] result = wordsArray[i].split("://");
				String domainName = result[result.length-1];
				
				if(domainName.contains("www.") && domainName.contains(".com"))
				System.out.println(domainName); // complete url extracted from lines.
				
				
				//String domainNameFiltered = domainNameWordArray[1];
				
			//	System.out.println(domainNameFiltered);
				
				
			}
		}

	}
}
