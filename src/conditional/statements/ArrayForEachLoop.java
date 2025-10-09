package conditional.statements;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		
		//Create arrayAmount[] array to store amount values
		int arrayAmount[] = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};
		
		int count = 1;
		int creditCount = 0;
		int debitCount = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousCredit = 0;
		int suspiciousDebit = 0;
		
		System.out.println("All Transactions: ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//Retrieve arrayAmount[] to allAmountData using for-each
		for(int allAmountData : arrayAmount) {
			//Get Credit Amount using if conditional statement allAmountData >= 0 (Positive)
			if(allAmountData >= 0) {
				creditCount++;
				totalCreditAmount += allAmountData;
				System.out.println("Transaction" + count++ + ": ₹" + allAmountData + "/-");
			}
			
			//Get Debit Amount using if conditional statement allAmountData < 0 (Negative)
			if(allAmountData < 0) {
				debitCount++;
				totalDebitAmount += allAmountData;
				System.out.println("Transaction" + count++ + ": ₹" + Math.abs(allAmountData) + "/-");
			}
			

		}
		

		System.out.println("=====================================================================================================================================================================");
		
		
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
		
		//Retrieve arrayAmount[] to allAmountData using for-each
		for(int allAmountData : arrayAmount) {
			//Get Credit Suspicious Amount using if conditional statement allAmountData > 10000 (Positive)
			if(allAmountData > 10000) {
				suspiciousCredit++;
				System.out.println("Suspicious Credit Transaction with Amount: ₹" + allAmountData + "/-");
			}
			
			//Get Debit Suspicious Amount using if conditional statement allAmountData > 10000 (Positive)
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
