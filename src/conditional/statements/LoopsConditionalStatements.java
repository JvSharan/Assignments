package conditional.statements;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

public class LoopsConditionalStatements {

	public static void main(String[] args) {
		
		//Create an object transaction1 to store Transaction1 and Amount using Map(LinkedHashMap)
		Map<String, Integer> transaction1 = new LinkedHashMap<String, Integer>();
		transaction1.put("Transaction", 1);
		transaction1.put("Amount", 50000);
		

        //Create an object transaction2 to store Transaction2 and Amount using Map(LinkedHashMap)
		Map<String, Integer> transaction2 = new LinkedHashMap<String, Integer>();
		transaction2.put("Transaction", 2);
		transaction2.put("Amount", -2000);
		

		//Create an object transaction3 to store Transaction3 and Amount using Map(LinkedHashMap)
		Map<String, Integer> transaction3 = new LinkedHashMap<String, Integer>();
		transaction3.put("Transaction", 3);
		transaction3.put("Amount", 3000);
		

		//Create an object transaction4 to store Transaction4 and Amount using Map(LinkedHashMap)
		Map<String, Integer> transaction4 = new LinkedHashMap<String, Integer>();
		transaction4.put("Transaction", 4);
		transaction4.put("Amount", -15000);
		

		
		//Create an object transaction5 to store Transaction5 and Amount using Map(LinkedHashMap)
		Map<String, Integer> transaction5 = new LinkedHashMap<String, Integer>();
		transaction5.put("Transaction", 5);
		transaction5.put("Amount", -200);
		

		//Create an object transaction6 to store Transaction6 and Amount using Map(LinkedHashMap)
		Map<String, Integer> transaction6 = new LinkedHashMap<String, Integer>();
		transaction6.put("Transaction", 6);
		transaction6.put("Amount", -300);
		

		//Create an object transaction7 to store Transaction7 and Amount using Map(LinkedHashMap)
		Map<String, Integer> transaction7 = new LinkedHashMap<String, Integer>();
		transaction7.put("Transaction", 7);
		transaction7.put("Amount", 4000);
		

		//Create an object transaction8 to store Transaction8 and Amount using Map(LinkedHashMap)
		Map<String, Integer> transaction8 = new LinkedHashMap<String, Integer>();
		transaction8.put("Transaction", 8);
		transaction8.put("Amount", -3000);
		

		//Create an object allTransactions to store All Transactions using List(ArrayList)
		List<Map<String, Integer>> allTransactions = new ArrayList<Map<String, Integer>>();
		
		allTransactions.add(transaction1);
		allTransactions.add(transaction2);
		allTransactions.add(transaction3);
		allTransactions.add(transaction4);
		allTransactions.add(transaction5);
		allTransactions.add(transaction6);
		allTransactions.add(transaction7);
		allTransactions.add(transaction8);
		
		
		System.out.println("All Transactions: ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(allTransactions);
		System.out.println("=====================================================================================================================================================================");
		
		int length = allTransactions.size();
		int creditCount = 0;
		int debitCount = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousCredit = 0;
		int suspiciousDebit = 0;
		
		//For loop is used to access the allTransactions Amount
		for(int i = 0; i < length; i++) {
			
			//To get Credit Amount details, amount should be positive. So, Amount should be 0 or greater
			if(allTransactions.get(i).get("Amount") >= 0) {
				//Post Increment is used to get the creditCount
				creditCount++;
				totalCreditAmount += allTransactions.get(i).get("Amount");
			}
			
			//To get Debit Amount details, amount should be negative. So, Amount should be less than 0
			if(allTransactions.get(i).get("Amount") < 0) {
				//Post Increment is used to get the debitCount
				debitCount++;
				
				totalDebitAmount += allTransactions.get(i).get("Amount");
			}
			
		}
		
		System.out.println();
		System.out.println("1. Print total number of credit and debit transactions completed.");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total Number of Credit Transactions: " + creditCount);
		System.out.println("Total Number of Debit Transactions: " + debitCount);
		System.out.println("======================================================================");
		System.out.println();

		
		System.out.println("2. Print the total amount credited and debited in account.");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total Credit Amount: ₹" + totalCreditAmount + "/-");
		System.out.println("Total Debit Amount: ₹" + Math.abs(totalDebitAmount) + "/-");
		System.out.println("======================================================================");
		System.out.println();

		
		int totalBankAmount = totalCreditAmount + totalDebitAmount;
		
		System.out.println("3. Print total amount remaining at the end in Bank Account ");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total Remaining Amount in Bank Account: ₹" + totalBankAmount + "/-");
		System.out.println("======================================================================");
		System.out.println();

		
		System.out.println("4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit Transaction with Amount” and also print total number of suspicious transactions ");
		System.out.println("----------------------------------------------------------------------");
		//For loop is used to access the allTransactions Amount
		for(int i = 0; i < length; i++) {
			//To get Suspicious Credit Transactions, amount should be positive and also greater than 10000
			if(allTransactions.get(i).get("Amount") > 10000) {
				suspiciousCredit++;
				System.out.println("Suspicious Credit Transaction with Amount: ₹" + allTransactions.get(i).get("Amount") + "/-");
			}
			//To get Suspicious Debit Transactions, amount should be negative and also less than -10000
			if(allTransactions.get(i).get("Amount") < -10000) {
				suspiciousDebit++;
				System.out.println("Suspicious Debit Transaction with Amount: ₹" + Math.abs(allTransactions.get(i).get("Amount")) + "/-");
			}
		}
		
		int totalSuspiciousCount = suspiciousCredit + suspiciousDebit;
		System.out.println();
		System.out.println("Total Number of Suspicious Transactions: " + totalSuspiciousCount);
		System.out.println("=====================================================================");
		
	}

}
