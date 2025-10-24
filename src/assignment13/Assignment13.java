package assignment13;

public class Assignment13 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		String words[] = paragraph.split("[,\\.\\s]+");
		int count = words.length;
		int occurrences = 0;
		
		System.out.println("Count of words in given paragraph:  " + count);
		System.out.println();
		System.out.println("Indexes of the word in given paragraph: ");
		
		for(int i = 0; i < count; i++) {
			int index = i+1;
			if(words[i].contentEquals("Java")) {
				occurrences++;
			}
			
			System.out.println("Index " + index +" - " + words[i]);
		}
		
		System.out.println();		
		System.out.println("2. Find the total number of occurrences of a \"Java\" word: " + occurrences);
		
		
		
	}

}
