package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionsInJava {

	public static void main(String[] args) {
		
		//Create Object for Test Case-1
		Map<String, Map<String, String>> testCase1 = new LinkedHashMap<String, Map<String, String>>();
		
		//Create Object for Row-1 in Test Case-1
		Map<String, String> tc1row1 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-1 in Test Case-1
		tc1row1.put("Name", "John Doe");
		tc1row1.put("Age", "Twenty");
		tc1row1.put("Gender", "Male");
		tc1row1.put("Roll Num", "SBA12345");
		tc1row1.put("Grade", "A++");
	    tc1row1.put("Major", "Computer");
		tc1row1.put("GPA", "A3.8");
		tc1row1.put("Email", "john@example.com");
		tc1row1.put("PAN Number", "SDF6543210");
		tc1row1.put("Address", "123 Elm St");
		
		//Retrieve stored keys and values of Row1 to TestCase-1
		testCase1.put("TestCase1-Row1", tc1row1);
		
		
	
		//Create Object for Row-2 in Test Case-1
		Map<String, String> tc1row2 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-2 in Test Case-1
		tc1row2.put("Name", "Jane Smith");
		tc1row2.put("Age", "Twenty One");
		tc1row2.put("Gender", "Female");
		tc1row2.put("Roll Num", "SBA12346");
		tc1row2.put("Grade", "B++");
		tc1row2.put("Major", "Mathematics");
		tc1row2.put("GPA", "A3.5");
		tc1row2.put("Email", "jane@example.com");
		tc1row2.put("PAN Number", "REW6543211");
		tc1row2.put("Address", "456 Oak St");
	
		//Retrieve stored keys and values of Row2 to TestCase-1
		testCase1.put("TestCase1-Row2", tc1row2);
		
		
		//Create Object for Row-3 in Test Case-1
		Map<String, String> tc1row3 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-3 in Test Case-1
		tc1row3.put("Name", "Mike Brown");
		tc1row3.put("Age", "Twenty Two");
		tc1row3.put("Gender", "Male");
		tc1row3.put("Roll Num", "SBA12347");
		tc1row3.put("Grade", "A++");
		tc1row3.put("Major", "Physics");
		tc1row3.put("GPA", "A3.9");
		tc1row3.put("Email", "mike@example.com");
		tc1row3.put("PAN Number", "TYR6543212");
		tc1row3.put("Address", "789 Pine St");
	
		//Retrieve stored keys and values of Row3 to TestCase-1
		testCase1.put("TestCase1-Row3", tc1row3);
		
		
		
		
		//Create Object for Test Case-2
		Map<String, Map<String, String>> testCase2 = new LinkedHashMap<String, Map<String, String>>();
		
		
		//Create Object for Row-1 in Test Case-2
		Map<String, String> tc2row1 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-1 in Test Case-2
		tc2row1.put("Employee ID", "E001");
		tc2row1.put("Name", "Alice Green");
		tc2row1.put("Age", "Twenty");
		tc2row1.put("Gender", "Male");
		tc2row1.put("Department", "Engineering");
		tc2row1.put("Position", "Software Engineer");
		tc2row1.put("Salary", "75K Pounds");
		tc2row1.put("Email", "john@example.com");
		tc2row1.put("PAN Number", "SDF6543210");
		
		//Retrieve stored keys and values of Row1 to TestCase-2
		testCase2.put("TestCase2-Row1", tc2row1);
		
		//Create Object for Row-2 in Test Case-2
		Map<String, String> tc2row2 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-2 in Test Case-2
		tc2row2.put("Employee ID", "E002");
		tc2row2.put("Name", "Bob Johnson");
		tc2row2.put("Age", "Twenty Five");
		tc2row2.put("Gender", "Male");
		tc2row2.put("Department", "Marketing");
		tc2row2.put("Position", "Marketing Manager");
		tc2row2.put("Salary", "85K Pounds");
		tc2row2.put("Email", "bob@example.com");
		tc2row2.put("PAN Number", "REW6543211");
		
		//Retrieve stored keys and values of Row2 to TestCase-2
		testCase2.put("TestCase2-Ro2", tc2row2);
		
		
		//Create Object for Row-3 in Test Case-2
		Map<String, String> tc2row3 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-3 in Test Case-2
		tc2row3.put("Employee ID", "E003");
		tc2row3.put("Name", "Carol White");
		tc2row3.put("Age", "Twenty Eight");
		tc2row3.put("Gender", "Female");
		tc2row3.put("Department", "Sales");
		tc2row3.put("Position", "Sales Executive");
		tc2row3.put("Salary", "65K Pounds");
		tc2row3.put("Email", "carol@example.com");
		tc2row3.put("PAN Number", "TYR6543212");
		
		//Retrieve stored keys and values of Row3 to TestCase-2
		testCase2.put("TestCase2-Row3", tc2row3);
		
		
		
		//Create Object for Test Case-3
		Map<String, Map<String, String>> testCase3 = new LinkedHashMap<String, Map<String, String>>();
		
		//Create Object for Row-1 in Test Case-3
		Map<String, String> tc3row1 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-1 in Test Case-3
		tc3row1.put("Product ID", "P001");
		tc3row1.put("Name", "Laptop");
		tc3row1.put("Category", "Electronics");
		tc3row1.put("Price", "12K Pounds");
		tc3row1.put("Stock Quantity", "Not Available");
		tc3row1.put("Supplier", "Tech Supplies");
		tc3row1.put("Warranty", "2 Years");
		tc3row1.put("Rating", "4.5 Stars");
		tc3row1.put("Manufacturing Date", "Aug 2023");
		tc3row1.put("Expiry Date", "Aug 2028");
		
		//Retrieve stored keys and values of Row1 to TestCase-3
		testCase3.put("TestCase3-Row1", tc3row1);
		
		
		//Create Object for Row-2 in Test Case-3
		Map<String, String> tc3row2 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-2 in Test Case-3
		tc3row2.put("Product ID", "P002");
		tc3row2.put("Name", "Desk Chair");
		tc3row2.put("Category", "Funiture");
		tc3row2.put("Price", "150K Pounds");
		tc3row2.put("Stock Quantity", "Two");
		tc3row2.put("Supplier", "Office Depot");
		tc3row2.put("Warranty", "1 Years");
		tc3row2.put("Rating", "4 Stars");
		tc3row2.put("Manufacturing Date", "Sep 2024");
		tc3row2.put("Expiry Date", "N/A");
		
		//Retrieve stored keys and values of Row2 to TestCase-3
		testCase3.put("TestCase3-Row2", tc3row2);
		
		
		//Create Object for Row-3 in Test Case-3
		Map<String, String> tc3row3 = new LinkedHashMap<String, String>();
		
		//Store Keys and Values for Row-3 in Test Case-3
		tc3row3.put("Product ID", "P003");
		tc3row3.put("Name", "Coffee Maker");
		tc3row3.put("Category", "Kitchen");
		tc3row3.put("Price", "75 Pounds");
		tc3row3.put("Stock Quantity", "Two Hundred");
		tc3row3.put("Supplier", "KitchenWorld");
		tc3row3.put("Warranty", "6 months");
		tc3row3.put("Rating", "4.2 Stars");
		tc3row3.put("Manufacturing Date", "Jan 2025");
		tc3row3.put("Expiry Date", "Jan 2027");
		
		//Retrieve stored keys and values of Row3 to TestCase-3
		testCase3.put("TestCase3-Row3", tc3row3);
		
		
		//Print ProductDetails ==> Supplier ==> Office Depot
		System.out.println(testCase3.get("TestCase3-Row2").get("Supplier"));


	}

}
