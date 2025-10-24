package assignment10;

public class ArrayAndLoops1 {

	public static void main(String[] args) {
		int numbers[] = {12, 34, 11, 36, 87, 98, 93};
		int length = numbers.length;
		
		System.out.println("Given Values: ");
		for(int i = 0; i < length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		for(int i = 0; i < length - 1; i++) {
			for(int j = i + 1; j < length ; j++) {
				if(numbers[i] < numbers[j]) {
					int temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array: ");
		for(int i = 0; i < length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("======================");;

	}

}
