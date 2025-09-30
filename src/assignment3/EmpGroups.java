package assignment3;

public class EmpGroups {

	public static void main(String[] args) {
		
		String empNames [] = new String[3];
		int empIDs [] = new int[3];
		
		//Create Object for Employees Class
		Employees obj = new Employees();
		
		//Retrieve the Employees Names from Employees class to EmpGroups class
		empNames[0] = obj.emp1Name;
		empNames[1] = obj.emp2Name;
		empNames[2] = obj.emp3Name;
		
		//Retrieve the Employees ID's from Employees class to EmpGroups class
		empIDs[0] = obj.emp1ID;
		empIDs[1] = obj.emp2ID;
		empIDs[2] = obj.emp3ID;
		
		//Print the Stored Employees Names and Employees ID's
		System.out.println("Employee Name: " + empNames[0] + ", Employee ID: " + empIDs[0]);
		System.out.println();
		System.out.println("Employee Name: " + empNames[1] + ", Employee ID: " + empIDs[1]);
		System.out.println();
		System.out.println("Employee Name: " + empNames[2] + ", Employee ID: " + empIDs[2]);

	}

}
