package streams_2.second.highest.number;

import java.util.List;
import java.util.stream.Collectors;
public class StreamsSecondHighestNumber {

	public static void main(String[] args) {
		List<Integer>givenNumbers = List.of(10, 45, 23, 78, 90, 90, 56);

		List<Integer> sortedNumbers = givenNumbers.stream().sorted().distinct().collect(Collectors.toList());
		
		int count = sortedNumbers.size();
		System.out.println("Second Highest Number using Streams:" + sortedNumbers.get(count-2));
	}

}
