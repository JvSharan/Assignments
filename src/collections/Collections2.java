package collections;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Collections2 {
	
	public static void main(String[] args) {
		
		
		//Create student1 to Store Student1 Details using Map(LinkedHashMap)
		Map<String, String> student1 = new LinkedHashMap<String, String>();
		
		student1.put("Name", "John Doe");
		student1.put("Age", "Twenty");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "SBA12345");
		student1.put("Grade", "A++");
		student1.put("Major", "Computer");
		student1.put("GPA", "A3.8");
		student1.put("Email", "john@example.com");
		student1.put("PAN Number", "SDF6543210");
		student1.put("Address", "123 Elm St");
	
		
		
		//Create student2 to Store Student2 Details using Map(LinkedHashMap)
		Map<String, String> student2 = new LinkedHashMap<String, String>();
		
		student2.put("Name", "Jane Smith");
		student2.put("Age", "Twenty One");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "SBA12346");
		student2.put("Grade", "B+");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "A3.5");
		student2.put("Email", "jane@example.com");
		student2.put("PAN Number", "REW6543211");
		student2.put("Address", "456 Oak St");
		
		
		//Create student3 to Store Student3 Details using Map(LinkedHashMap)
		Map<String, String> student3 = new LinkedHashMap<String, String>();
		
		student3.put("Name", "Mike Brown");
		student3.put("Age", "Twenty Two");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "SBA12347");
		student3.put("Grade", "A+");
		student3.put("Major", "Physics");
		student3.put("GPA", "A3.9");
		student3.put("Email", "mike@example.com");
		student3.put("PAN Number", "TYR6543212");
		student3.put("Address", "789 Pine St");
		
		
		//Create studentsList to store all Students Details using List(ArrayList)
		List<Map<String, String>> studentsList = new ArrayList<Map<String, String>>();
		
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		
		//Print Students List with Students Details
		System.out.println("Students List: " + studentsList);
		System.out.println("========================================================================");
		System.out.println("Student_1 Details: " + student1);
		System.out.println("Student_2 Details: " + student2);
		System.out.println("Student_3 Details: " + student3);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		//Create employee1 to Store Employee1 Details using Map(LinkedHashMap)
		Map<String, String> employee1 = new LinkedHashMap<String, String>();
		
		employee1.put("Employee ID", "E001");
		employee1.put("Name", "Alice Green");
		employee1.put("Age", "Thirty");
		employee1.put("Gender", "Female");
		employee1.put("Department", "Engineering");
		employee1.put("Position", "Software Engineer");
		employee1.put("Salary", "75K Pounds");
		employee1.put("Email", "alice@example.com");
		employee1.put("PAN Number", "SDF6543210");
		
		
		//Create employee2 to Store Employee2 Details using Map(LinkedHashMap)
		Map<String, String> employee2 = new LinkedHashMap<String, String>();
		
		employee2.put("Employee ID", "E002");
		employee2.put("Name", "Bob Johnson");
		employee2.put("Age", "Thirty Five");
		employee2.put("Gender", "Male");
		employee2.put("Department", "Marketing");
		employee2.put("Position", "Marketing Manager");
		employee2.put("Salary", "85K Pounds");
		employee2.put("Email", "bob@example.com");
		employee2.put("PAN Number", "REW6543211");
		
		
		//Create employee3 to Store Employee3 Details using Map(LinkedHashMap)
		Map<String, String> employee3 = new LinkedHashMap<String, String>();
		
		employee3.put("Employee ID", "E003");
		employee3.put("Name", "Carol White");
		employee3.put("Age", "Twenty Eight");
		employee3.put("Gender", "Female");
		employee3.put("Department", "Sales");
		employee3.put("Position", "Sales Executive");
		employee3.put("Salary", "65K Pounds");
		employee3.put("Email", "carol@example.com");
		employee3.put("PAN Number", "TYR6543212");
		
		//Create employeesList to store all Employees Details using List(ArrayList)
		List<Map<String, String>> employeesList = new ArrayList<Map<String, String>>();
		
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);
		
		//Print Employees List with Employees Details
		System.out.println("Employees List: " + employeesList);
		
		System.out.println("========================================================================");
		System.out.println("Employee_1 Details: " + employee1);
		System.out.println("Employee_2 Details: " + employee2);
		System.out.println("Employee_3 Details: " + employee3);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		
		//Create product1 to Store Product1 Details using Map(LinkedHashMap)
		Map<String, String> product1 = new LinkedHashMap<String, String>();
		
		product1.put("Product ID", "P001");
		product1.put("Name", "Laptop");
		product1.put("Category", "Electronics");
		product1.put("Price", "12K Pounds");
		product1.put("Stock Quantity", "Not Available");
		product1.put("Supplier", "Tech Supplies");
		product1.put("Warranty", "2 Years");
		product1.put("Rating", "4.5 Stars");
		product1.put("Manufacturing Date", "Aug 2023");
		product1.put("Expiry Date", "Aug 2028");
		
		
		//Create product2 to Store Product2 Details using Map(LinkedHashMap)
		Map<String, String> product2 = new LinkedHashMap<String, String>();
		
		product2.put("Product ID", "P002");
		product2.put("Name", "Desk Chair");
		product2.put("Category", "Furniture");
		product2.put("Price", "150K Pounds");
		product2.put("Stock Quantity", "Two");
		product2.put("Supplier", "Office Depot");
		product2.put("Warranty", "1 Year");
		product2.put("Rating", "4 Stars");
		product2.put("Manufacturing Date", "Sep 2024");
		product2.put("Expiry Date", "N/A");
		
		
		
		//Create product3 to Store Product3 Details using Map(LinkedHashMap)
		Map<String, String> product3 = new LinkedHashMap<String, String>();
		
		product3.put("Product ID", "P003");
		product3.put("Name", "Coffee Maker");
		product3.put("Category", "Kitchen");
		product3.put("Price", "75 Pounds");
		product3.put("Stock Quantity", "Two Hundred");
		product3.put("Supplier", "KitchenWorld");
		product3.put("Warranty", "6 Months");
		product3.put("Rating", "4.2 Stars");
		product3.put("Manufacturing Date", "Jan 2025");
		product3.put("Expiry Date", "Jan 2027");
		
		//Create productsList to store all Products Details using List(ArrayList)
		List<Map<String, String>> productsList = new ArrayList<Map<String, String>>();
		
		productsList.add(product1);
		productsList.add(product2);
		productsList.add(product3);
		
		//Print Products List with Products Details
		System.out.println("Products List: " + productsList);
		
		System.out.println("========================================================================");
		System.out.println("Product_1 Details: " + product1);
		System.out.println("Product_2 Details: " + product2);
		System.out.println("Product_3 Details: " + product3);
		
		
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		
		//Create Data Object to store all data like studentsList, employeesList, productsList using Map(HashMap)
		Map<String, List<Map<String, String>>> allData = new HashMap<String, List<Map<String, String>>>();
		
		allData.put("Students Data", studentsList);
		allData.put("Employees Data", employeesList);
		allData.put("Products Data", productsList);
		
		//Print All Data Lists
		System.out.println("All Data Lists: " + allData);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		//Print Supplier Name of Product2 of ProductsList
		System.out.println("Supplier Name of Product_2 of Products List: " + product2.get("Supplier"));
		
		//Print Supplier Name of 2nd Row of Products List
		System.out.println("Supplier Name of 2nd Row of Products List: " + allData.get("Products Data").get(1).get("Supplier"));
		
		
	}

}