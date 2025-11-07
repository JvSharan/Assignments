package streams_5.total.characters.startingWithS;

import java.util.List;
import java.util.ArrayList;
public class TotalCharactersOfAllWordsStartWithS {

	public static void main(String[] args) {
		List<String> givenWords = List.of("Selenium", "Java", "spring", "RestAssured");
		
		List<String> wordStartWithS = new ArrayList<String>();
		
		int total = 0;
		for(String words : givenWords) {
			if(words.charAt(0) == 'S' || words.charAt(0) == 's') {
				total += words.length();
				wordStartWithS.add(words);
			}
		}
		
		
		
		System.out.println("All words starting with \"S\" or \"s\": " + wordStartWithS);
		System.out.println("Total characters in all words starting with \"S\" or \"s\": " + total);

	}

}
