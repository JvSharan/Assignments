package conditional.statements;

import java.util.List;
import java.util.ArrayList;

public class ListForEachLoop {

	public static void main(String[] args) {
		
		List<Integer> amount = new ArrayList<Integer>();
		amount.add(50000);
		amount.add(-2000);
		amount.add(3000);
		amount.add(-15000);
		amount.add(-200);
		amount.add(-300);
		amount.add(4000);
		amount.add(-3000);
		
		System.out.println("All Transactions: ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(amount);
		System.out.println("=====================================================================================================================================================================");
		
		int creditCount = 0;
		int debitCount = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousCredit = 0;
		int suspiciousDebit = 0;
		
		for(int allAmountData : amount) {
			if(allAmountData >= 0) {
				creditCount++;
				totalCreditAmount += allAmountData;
			}
			
			if(allAmountData < 0) {
				debitCount++;
				totalDebitAmount += allAmountData;
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
		for(int allAmountData : amount) {
			if(allAmountData > 10000) {
				suspiciousCredit++;
				System.out.println("Suspicious Credit Transaction with Amount: ₹" + allAmountData + "/-");
			}
			
			if(allAmountData < -10000) {
				suspiciousDebit++;
				System.out.println("Suspicious Debit Transaction with Amount: ₹" + Math.abs(allAmountData) + "/-");
			}
		}
		
		int totalSuspiciousCount = suspiciousCredit + suspiciousDebit;
	
		System.out.println();
		System.out.println("Total Number of Suspicious Transactions: " + totalSuspiciousCount);
		System.out.println("=====================================================================");
	}

}
