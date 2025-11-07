package streams_4.total.of.top3HighestValues;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
public class StreamTotalOfTop3Values {

	public static void main(String[] args) {
		
		List<Float> givenNumbers = List.of(200.0f, 450.0f, 120.0f, 600.0f, 750.0f);
		
		List<Float> top3HighestValues = givenNumbers.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).collect(Collectors.toList());
		
		float total = top3HighestValues.stream().reduce(0.0f, (a, b) -> a + b);
		
		
		System.out.println("Top 3 Highest values: " + top3HighestValues);
		System.out.println("Total sum of top 3 Highest values using Stream: " + total);
		
	}

}
