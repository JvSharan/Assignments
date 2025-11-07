package streams_2.second.highest.number;


import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamSecondHighestNumber1 {

	public static void main(String[] args) {
		
		List<Integer>givenNumbers = List.of(10, 45, 23, 78, 90, 90, 56);

		List<Integer> sortedNumbers = givenNumbers.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		
		System.out.println("Second Highest Number using Streams:" + sortedNumbers.get(1));

	}

}
