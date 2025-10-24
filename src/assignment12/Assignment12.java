package assignment12;

public class Assignment12 {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
		
		//split() is used to convert the sentence to array which are separated by the space(\\s)
		String words[] = sentence.split("[\\s]+");
		
		int count = words.length;
		
		System.out.println("Number of Words in given sentence: " + count);
		
		System.out.println();
		System.out.println("Reverse order of words in given sentence: ");
		//for loop is used to print reverse order of words
		for(int i = count-1; i >= 0; i--) {
			System.out.println(words[i]);
		}
		
		System.out.println();
		for(int i = 0; i < count; i++) {
			//toUpperCase().charAt(0) is used to change the first character of each word to Upper case
			words[i] = words[i].toUpperCase().charAt(0) + words[i].substring(1);
		}
		
		String capitalizedSentence = String.join(" ", words);
		System.out.println("First character of each word in given sentence should be Upper Case: ");
		System.out.println(capitalizedSentence);
	}

}
