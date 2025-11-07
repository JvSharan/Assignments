package assignment15_2.second.highest.number;

import java.util.List;
import java.util.ArrayList;
public class SecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> givenNumbers = new ArrayList<Integer>();
		
		List<Integer> sortedNumbers = new ArrayList<Integer>();
		
//		List.of(10, 45, 23, 78, 90, 90, 56)
		givenNumbers.add(10);
		givenNumbers.add(45);
		givenNumbers.add(23);
		givenNumbers.add(78);
		givenNumbers.add(90);
		givenNumbers.add(90);
		givenNumbers.add(56);
		
		int count = givenNumbers.size();
		
		for(int i = 0; i < count-1; i++) {
			for(int j = i+1; j < count; j++) {
				if(givenNumbers.get(i) < givenNumbers.get(j) ) {
					int temp = givenNumbers.get(j);
					givenNumbers.set(j, givenNumbers.get(i));
					givenNumbers.set(i, temp);
				}
			}
		}
		
		for(Integer numbers : givenNumbers) {
			if(!sortedNumbers.contains(numbers) ) {
				sortedNumbers.add(numbers);
			}
		}
		
		System.out.println("Second Highest Number: " + sortedNumbers.get(1));

	}

}
