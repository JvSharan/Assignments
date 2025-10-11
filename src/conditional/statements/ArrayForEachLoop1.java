package conditional.statements;

public class ArrayForEachLoop1 {

	public static void main(String[] args) {
		
		//Create arrayAmount[] array to store amount values
		int arrayAmount[] = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};
		
		int creditCount = 0;
		int debitCount = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousCount = 0;
		
		//Retrieve arrayAmount[] to allAmountData using for-each
		for(int allAmountData : arrayAmount) {
			
			//Get Credit Amount using if conditional statement allAmountData >= 0 (Positive)
			if(allAmountData >= 0) {
				creditCount++;
				totalCreditAmount += allAmountData;
				
				if(allAmountData > 10000) {
					suspiciousCount++;
					System.out.println("Suspicious Credit Transaction with Amount: ₹" + allAmountData + "/-");
				}
				
			}
			
			//Get Debit Amount using if conditional statement allAmountData < 0 (Negative)
			if(allAmountData < 0) {
				debitCount++;
			    totalDebitAmount -= allAmountData;
			    
			    if(allAmountData < -10000) {
			    	suspiciousCount++;
			    	System.out.println("Suspicious Debit Transaction with Amount: ₹" + Math.abs(allAmountData) + "/-");
			    }
			    
			}
			
		}
		
		int totalBankAmount = totalCreditAmount - totalDebitAmount;
		
		System.out.println("Total Number of Credit Transactions: " + creditCount);
		System.out.println("Total Number of Debit Transactions: " + debitCount);
		System.out.println("Total Credit Amount: ₹" + totalCreditAmount + "/-");
		System.out.println("Total Debit Amount: ₹" + totalDebitAmount + "/-");
		System.out.println("Total Remaining Amount in Bank Account: ₹" + totalBankAmount + "/-");
		System.out.println("Total Number of Suspicious Transactions: " + suspiciousCount);

	}

}
