package streams_3.sum.of.squares.of.allOddNumbers;

import java.util.List;
import java.util.ArrayList;
public class SumOfSquaresOfOddNumbers {

	public static void main(String[] args) {
		List<Integer> givenNumbers = List.of(1, 2, 3, 4, 5);

		List<Integer> oddNumbers = new ArrayList<Integer>();
		
		for(Integer odd : givenNumbers) {
			if(odd%2 != 0) {
				oddNumbers.add(odd*odd);
			}
		}
		
		int count = oddNumbers.size();
		int sum = 0;
		
		for(int i = 0; i < count; i++) {
			sum += oddNumbers.get(i);
		}
		
		System.out.println("Sum of Squares of all Odd numbers: " + sum);
	}

}
