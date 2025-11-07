package streams_5.total.characters.startingWithS;

import java.util.List;
import java.util.stream.Collectors;
public class StreamTotalCharactersOfWordsWithS {

	public static void main(String[] args) {
		List<String> givenWords = List.of("Selenium", "Java", "spring", "RestAssured");
		
//		List<String> wordsStartWithS = givenWords.stream().filter(x -> x.charAt(0) == 'S' || x.charAt(0) == 's').collect(Collectors.toList());
		
		List<String> wordsStartWithS = givenWords.stream().filter(x -> x.toLowerCase().startsWith("s")).collect(Collectors.toList());
		
		int total = wordsStartWithS.stream().map(s -> s.length()).reduce(0, (a, b) -> a+b);
		
		
		System.out.println("All words starting with \"S\" or \"s\": " + wordsStartWithS);
		System.out.println("Total characters in all words starting with \"S\" or \"s\" using Streams: " + total);
	
	}

}
