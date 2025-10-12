package assignment9;

import java.util.Map;
import java.util.LinkedHashMap;

public class ConditionalStatementsAndLoops {

	public static void main(String[] args) {
		
		String names[] = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		int length = names.length;
		double baseSalary[] = {75000.0d, 68000.0d, 82000.0d, 90000.0d, 60000.0d};
		float experience[] = {5.1f, 3.2f, 7.1f, 10.2f, 2.4f};
		float yearEndRating[] = {4.2f, 3.8f, 4.5f, 2.5f, 3.5f};
		
	

		
		float variablePayPercentage = 0.0f;
		float variablePay;
		int bonus = 0;
		int reward = 0;
		
		//Create hike[] and hikePercentage[] to store the values
		double hike[] = new double[length];
		double hikePercentage[] = new double[length];
		
		//Create employeesHike to store both names and hikePercentage values
		Map<String, Double> employeesHike = new LinkedHashMap<String, Double>();
		
		System.out.println("Employees Hike Percentage Value: ");
		System.out.println("=============================================");
		for(int i = 0; i < length; i++) {
			//yearEndRating should 4 or greater using if conditional statement
			if(yearEndRating[i] >= 4.0f) {
				variablePayPercentage = 15.0f;
				bonus = 1500;
			}
			
			//yearEndRating should 3 or greater and less than 4 using if conditional statement
			if(yearEndRating[i] >= 3.0f && yearEndRating[i] < 4.0f) {
				variablePayPercentage = 10.0f;
				bonus = 1200;
			}
			
			//yearEndRating should less than 3 using if conditional statement
			if(yearEndRating[i] < 3.0f) {
				variablePayPercentage = 3.0f;
				bonus = 300;
			}
			
			variablePay = variablePayPercentage / 100;
			
			//experience should be 5 or greater to get reward 5000 using if conditional statement
			if(experience[i] >= 5.0f) {
				reward = 5000;
			}
			
			//Otherwise reward 0
			else {
				reward = 0;
			}
			
			hike[i] = (baseSalary[i] * variablePay) + bonus + reward;
			
			hikePercentage[i] = hike[i] / baseSalary[i];
			employeesHike.put(names[i], hikePercentage[i]);
			
			System.out.println(names[i] + " ==> "+ employeesHike.get(names[i]) * 100 + "%");
		}
	}

}
