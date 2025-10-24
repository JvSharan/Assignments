package assignment14;

public class TrianglePattern {

	public static void main(String[] args) {
		int row = 5;
		
		System.out.println("Triangle Pattern: ");
		//Outer loop is used to number of rows
		for(int i = 1; i <= row; i++) {
			
			//First inner loop is used to get space
			for(int k = i; k < row; k++) {
				System.out.print(" ");
			}
			
			//Second inner loop is used to print "*"
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
