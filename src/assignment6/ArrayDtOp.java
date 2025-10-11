package assignment6;

public class ArrayDtOp {

	public static void main(String[] args) {
		
		//Create an array names[] to store names
		String names [] = {"Suresh", "Mahesh", "Naresh"};
		
		//Create an array marks[] to store marks
		int marks[] = {75, 80, 82};
		
		//Get length of the marks[] array
		int length = marks.length;
		
		//Create new array newMarks to store 10 marks add to each in marks[]
		int newMarks[] = new int[length];
		
		int newMarksTotal = 0;
	
		System.out.println("Updated Marks: ");
		
		//Add 10 marks each in marks[] and retrieve new marks in newMarks[] using for loop
		for(int i = 0; i < length; i++) {
			newMarks[i] = marks[i] + 10;
			
			newMarksTotal += newMarks[i];
			
			System.out.println(names[i] + ": " + newMarks[i]);
			
		}
		
		//Average(averageMarks) = Sum of all Marks(newMarksTotal) / Number of Marks(length)
		float averageMarks = newMarksTotal / length;
		
		System.out.println("Average Marks: " + averageMarks);
				
	}

}
