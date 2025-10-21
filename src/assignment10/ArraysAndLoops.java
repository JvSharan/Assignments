package assignment10;

public class ArraysAndLoops {

	public static void main(String[] args) {
		//Stored given values in an array
		int numbers[] = {12, 34, 11, 36, 87, 98, 93};
		int length = numbers.length;
		
		System.out.println("Given Values: ");
		for(int i = 0; i < length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		int numberOfRotations = length - 1;
		//Outer loop is used to number of rotations
		for(int i = 0; i < numberOfRotations; i++) {
			//Inner Loop is used to number of checking the condition for two side by side values
			for(int j = 0; j < numberOfRotations - i; j++) {
				if(numbers[j] < numbers[j+1]) {
					int temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array: ");
		for(int i = 0; i < length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		System.out.println("Second Largest Value: " + numbers[1]);
		System.out.println("Third Largest Value: " + numbers[2]);
	}

}
