package assignment15_1.average.of.AllEvenNumbers;

import java.util.List;
import java.util.ArrayList;
public class AverageOfEvenNumber {

	public static void main(String[] args) {
		
		int sum = 0;
		List<Integer> givenNumbers = List.of(10, 15, 20, 25, 30);
		
		List<Integer> evenNumbers = new ArrayList<Integer>();
		for(Integer numbers : givenNumbers) {
			if(numbers % 2 == 0) {
				evenNumbers.add(numbers);
				sum += numbers;
			}
		}
		
		int numberOfEven = evenNumbers.size();
		float averageOfEven = sum / numberOfEven;

		System.out.println("Average of all Even Numbers: " + averageOfEven);
	}

}
