package collections;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Collecctions1 {
	
	public static void main(String[] args) {
		
		
		//Create student_1 to Store Student_1 Details using Map(LinkedHashMap)
		Map<String, String> student_1 = new LinkedHashMap<String, String>();
		
		student_1.put("Name", "John Doe");
		student_1.put("Age", "Twenty");
		student_1.put("Gender", "Male");
		student_1.put("Roll Number", "SBA12345");
		student_1.put("Grade", "A++");
		student_1.put("Major", "Computer");
		student_1.put("GPA", "A3.8");
		student_1.put("Email", "john@example.com");
		student_1.put("PAN Number", "SDF6543210");
		student_1.put("Address", "123 Elm St");
	
		
		
		//Create student_2 to Store Student_2 Details using Map(LinkedHashMap)
		Map<String, String> student_2 = new LinkedHashMap<String, String>();
		
		student_2.put("Name", "Jane Smith");
		student_2.put("Age", "Twenty One");
		student_2.put("Gender", "Female");
		student_2.put("Roll Number", "SBA12346");
		student_2.put("Grade", "B+");
		student_2.put("Major", "Mathematics");
		student_2.put("GPA", "A3.5");
		student_2.put("Email", "jane@example.com");
		student_2.put("PAN Number", "REW6543211");
		student_2.put("Address", "456 Oak St");
		
		
		//Create student_3 to Store Student_3 Details using Map(LinkedHashMap)
		Map<String, String> student_3 = new LinkedHashMap<String, String>();
		
		student_3.put("Name", "Mike Brown");
		student_3.put("Age", "Twenty Two");
		student_3.put("Gender", "Male");
		student_3.put("Roll Number", "SBA12347");
		student_3.put("Grade", "A+");
		student_3.put("Major", "Physics");
		student_3.put("GPA", "A3.9");
		student_3.put("Email", "mike@example.com");
		student_3.put("PAN Number", "TYR6543212");
		student_3.put("Address", "789 Pine St");
		
		
		//Create StudentsList to store all Students Details using List(ArrayList)
		List<Map<String, String>> StudentsList = new ArrayList<Map<String, String>>();
		
		StudentsList.add(student_1);
		StudentsList.add(student_2);
		StudentsList.add(student_3);
		
		//Print Students List with Students Details
		System.out.println("Students List: " + StudentsList);
		System.out.println("========================================================================");
		System.out.println("Student_1 Details: " + student_1);
		System.out.println("Student_2 Details: " + student_2);
		System.out.println("Student_3 Details: " + student_3);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		//Create employee_1 to Store Employee_1 Details using Map(LinkedHashMap)
		Map<String, String> employee_1 = new LinkedHashMap<String, String>();
		
		employee_1.put("Employee ID", "E001");
		employee_1.put("Name", "Alice Green");
		employee_1.put("Age", "Thirty");
		employee_1.put("Gender", "Female");
		employee_1.put("Department", "Engineering");
		employee_1.put("Position", "Software Engineer");
		employee_1.put("Salary", "75K Pounds");
		employee_1.put("Email", "alice@example.com");
		employee_1.put("PAN Number", "SDF6543210");
		
		
		//Create employee_2 to Store Employee_2 Details using Map(LinkedHashMap)
		Map<String, String> employee_2 = new LinkedHashMap<String, String>();
		
		employee_2.put("Employee ID", "E002");
		employee_2.put("Name", "Bob Johnson");
		employee_2.put("Age", "Thirty Five");
		employee_2.put("Gender", "Male");
		employee_2.put("Department", "Marketing");
		employee_2.put("Position", "Marketing Manager");
		employee_2.put("Salary", "85K Pounds");
		employee_2.put("Email", "bob@example.com");
		employee_2.put("PAN Number", "REW6543211");
		
		
		//Create employee_3 to Store Employee_3 Details using Map(LinkedHashMap)
		Map<String, String> employee_3 = new LinkedHashMap<String, String>();
		
		employee_3.put("Employee ID", "E003");
		employee_3.put("Name", "Carol White");
		employee_3.put("Age", "Twenty Eight");
		employee_3.put("Gender", "Female");
		employee_3.put("Department", "Sales");
		employee_3.put("Position", "Sales Executive");
		employee_3.put("Salary", "65K Pounds");
		employee_3.put("Email", "carol@example.com");
		employee_3.put("PAN Number", "TYR6543212");
		
		//Create EmployeesList to store all Employees Details using List(ArrayList)
		List<Map<String, String>> EmployeesList = new ArrayList<Map<String, String>>();
		
		EmployeesList.add(employee_1);
		EmployeesList.add(employee_2);
		EmployeesList.add(employee_3);
		
		//Print Employees List with Employees Details
		System.out.println("Employees List: " + EmployeesList);
		
		System.out.println("========================================================================");
		System.out.println("Employee_1 Details: " + employee_1);
		System.out.println("Employee_2 Details: " + employee_2);
		System.out.println("Employee_3 Details: " + employee_3);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		
		//Create product_1 to Store Product_1 Details using Map(LinkedHashMap)
		Map<String, String> product_1 = new LinkedHashMap<String, String>();
		
		product_1.put("Product ID", "P001");
		product_1.put("Name", "Laptop");
		product_1.put("Category", "Electronics");
		product_1.put("Price", "12K Pounds");
		product_1.put("Stock Quantity", "Not Available");
		product_1.put("Supplier", "Tech Supplies");
		product_1.put("Warranty", "2 Years");
		product_1.put("Rating", "4.5 Stars");
		product_1.put("Manufacturing Date", "Aug 2023");
		product_1.put("Expiry Date", "Aug 2028");
		
		
		//Create product_2 to Store Product_2 Details using Map(LinkedHashMap)
		Map<String, String> product_2 = new LinkedHashMap<String, String>();
		
		product_2.put("Product ID", "P002");
		product_2.put("Name", "Desk Chair");
		product_2.put("Category", "Furniture");
		product_2.put("Price", "150K Pounds");
		product_2.put("Stock Quantity", "Two");
		product_2.put("Supplier", "Office Depot");
		product_2.put("Warranty", "1 Year");
		product_2.put("Rating", "4 Stars");
		product_2.put("Manufacturing Date", "Sep 2024");
		product_2.put("Expiry Date", "N/A");
		
		
		
		//Create product_3 to Store Product_3 Details using Map(LinkedHashMap)
		Map<String, String> product_3 = new LinkedHashMap<String, String>();
		
		product_3.put("Product ID", "P003");
		product_3.put("Name", "Coffee Maker");
		product_3.put("Category", "Kitchen");
		product_3.put("Price", "75 Pounds");
		product_3.put("Stock Quantity", "Two Hundred");
		product_3.put("Supplier", "KitchenWorld");
		product_3.put("Warranty", "6 Months");
		product_3.put("Rating", "4.2 Stars");
		product_3.put("Manufacturing Date", "Jan 2025");
		product_3.put("Expiry Date", "Jan 2027");
		
		//Create ProductsList to store all Products Details using List(ArrayList)
		List<Map<String, String>> ProductsList = new ArrayList<Map<String, String>>();
		
		ProductsList.add(product_1);
		ProductsList.add(product_2);
		ProductsList.add(product_3);
		
		//Print Products List with Products Details
		System.out.println("Products List: " + ProductsList);
		
		System.out.println("========================================================================");
		System.out.println("Product_1 Details: " + product_1);
		System.out.println("Product_2 Details: " + product_2);
		System.out.println("Product_3 Details: " + product_3);
		
		
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		
		//Create Data Object to store all data like StudentsList, EmployeesList, ProductsList using Map(HashMap)
		Map<String, List<Map<String, String>>> Data = new HashMap<String, List<Map<String, String>>>();
		
		Data.put("Students Data", StudentsList);
		Data.put("Employees Data", EmployeesList);
		Data.put("Products Data", ProductsList);
		
		//Print All Data Lists
		System.out.println("All Data Lists: " + Data);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		//Print Supplier Name of Product_2 of ProductsList
		System.out.println("Supplier Name of Product_2 of Products List: " + product_2.get("Supplier"));
		
		//Print Supplier Name of 2nd Row of Products List
		System.out.println("Supplier Name of 2nd Row of Products List: " + Data.get("Products Data").get(1).get("Supplier"));
		
		
	}

}
