package streams_3.sum.of.squares.of.allOddNumbers;

import java.util.List;
import java.util.stream.Collectors;
public class StreamsSumOfSquaresOfOdd {

	public static void main(String[] args) {
		List<Integer> givenNumbers = List.of(1, 2, 3, 4, 5);
		
		List<Integer> oddNumbers = givenNumbers.stream().filter(x -> x%2 != 0).map(x -> x*x).collect(Collectors.toList());

		int sum = oddNumbers.stream().reduce(0, (a, b) -> a + b);
		
		System.out.println("Sum of Squares of all Odd numbers using Streams: " + sum);
	}

}
