package streams_4.total.of.top3HighestValues;

import java.util.List;
import java.util.ArrayList;
public class TotalOfTop3HighestValues {

	public static void main(String[] args) {
		List<Float> givenNumbers = new ArrayList<Float>();
		givenNumbers.add(200.0f);
		givenNumbers.add(450.0f);
		givenNumbers.add(120.0f);
		givenNumbers.add(600.0f);
		givenNumbers.add(750.0f);
//				List.of(200.0f, 450.0f, 120.0f, 600.0f, 750.0f);
		List<Float> top3HighestValues = new ArrayList<Float>();
		
		int count = givenNumbers.size();

		for(int i = 0; i < count-1; i++) {
			for(int j = i+1; j < count; j++) {
				if(givenNumbers.get(i) < givenNumbers.get(j)) {
					float temp = givenNumbers.get(j);
					givenNumbers.set(j,  givenNumbers.get(i));
					givenNumbers.set(i, temp);
				}
			}
		}
		
		float total = 0;
		
		for(int i = 0; i < 3; i++) {
			top3HighestValues.add(givenNumbers.get(i));
			total += top3HighestValues.get(i);
		}
		
		System.out.println("Top 3 Highest values: " + top3HighestValues);
		System.out.println("Total sum of top 3 highest values: " + total);
		
	}

}
