package arr.cla.obj;

public class EmpGroups {
	
	String empNames [] = new String[3];
	int empID [] = new int[3];
	

	public static void main(String[] args) {
		

		//Create Object for EmpGroups Class
		EmpGroups obj1 = new EmpGroups();
		
		//Create Object for Employees Class 
		Employees obj2 = new Employees();
		
		//Retrieve the Employees Names from Employees class to EmpGroups class
		obj1.empNames[0] = obj2.emp1Name;
		obj1.empNames[1] = obj2.emp2Name;
		obj1.empNames[2] = obj2.emp3Name;
		
		//Retrieve the Employees ID's from Employees class to EmpGroups class
		obj1.empID[0] = obj2.emp1ID;
		obj1.empID[1] = obj2.emp2ID;
		obj1.empID[2] = obj2.emp3ID;
		
		
		//Print the Stored Employees Names and Employees ID's
		System.out.println("Employee Name: " + obj1.empNames[0] + ", Employee ID: " + obj1.empID[0]);
		System.out.println();
		System.out.println("Employee Name: " + obj1.empNames[1] + ", Employee ID: " + obj1.empID[1]);
		System.out.println();
		System.out.println("Employee Name: " + obj1.empNames[2] + ", Employee ID: " + obj1.empID[2]);
	}

}
