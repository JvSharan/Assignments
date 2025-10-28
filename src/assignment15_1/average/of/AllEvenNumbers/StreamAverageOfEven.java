package assignment15_1.average.of.AllEvenNumbers;

import java.util.List;
import java.util.stream.Collectors;
public class StreamAverageOfEven {

	public static void main(String[] args) {
	
		List<Integer> givenNumbers = List.of(10, 15, 20, 25, 30);
		List<Integer> evenNumbers = givenNumbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		
		int total = evenNumbers.stream().reduce(0, (a, b) -> a + b);
		int numberOfEven = evenNumbers.size();
		float averageOfEven = total / numberOfEven;
		
		System.out.println("Average of all Even Numbers: " + averageOfEven);
		
	}

}
