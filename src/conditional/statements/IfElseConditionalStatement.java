package conditional.statements;

public class IfElseConditionalStatement {

	public static void main(String[] args) {
		
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		
		System.out.println("Welcome to Bank Loan Application");
		System.out.println("---------------------------------");
		System.out.println();
		
		/*Bank evaluates loan applicants based on the following criteria:
		 * 
		 * 1. Credit Score.
		 * 2. Income.
		 * 3. Employment Status.
		 * 4. Debt-to-Income Ratio.
		 * 
		 */
		System.out.println("Bank evaluates loan applicants based on the following criteria: ");
		System.out.println("=================================================================");
		System.out.println();
		//1. Credit Score.
		System.out.println("1. Credit Score: ");
		System.out.println("-----------------------------------------------");
		
		//Conditional Statement should satisfy creditScore greater than 750.
		if(creditScore > 750) {
			System.out.println("Customer's Credit score is: " + creditScore + ".");
			System.out.println("The Credit Score is above 750.");
			System.out.println();
			System.out.println("===========================================================================");
			System.out.println("Congractulation! " + customerName + ", the Loan is automatically approved.");
			System.out.println("===========================================================================");
		}
		
		//Conditional Statement should satisfy creditScore is between 650 and 750.
		else if(creditScore >= 650 && creditScore <= 750) {
			System.out.println("Customer's Credit score is: " + creditScore);
			System.out.println("The Credit Score is between 650 and 750, additional checks are performed.");
			System.out.println();
			
			//For credit scores between 650 and 750, the customer’s income must be at least $50,000 for the loan to be considered.
			//2. Income.
			System.out.println("2. Income:");
			System.out.println("-------------------------------------");
			//Conditional Statement should satisfy Income $50,000 or greater.
			if(income >= 50000.0f) {
				System.out.println("Customer's Income is: $" + income);
				System.out.println("Customer's Income is atleast $50,000, the system checks for the Customer's Employed or not.");
				System.out.println();
				
				//If the customer’s income is at least  50,000, the system checks whether the customer is employed.
				//3. Employment Status
				System.out.println("3. Employment Status: ");
				System.out.println("----------------------------------------------------");
				//Conditional Statement should satisfy isEmployed is true.
				if(isEmployed == true) {
					System.out.println("Employment Status of Customer is: " + isEmployed);
					System.out.println("Customer is Employed, the System checks the debt-to-income (DTI) ratio.");
					System.out.println();
					
					//If the customer is employed, the system checks the debt-to-income (DTI) ratio.
					//4. Debt-to-Income Ratio
					System.out.println("4. Debt-to-Income Ratio: ");
					System.out.println("------------------------------------------------------------------");
					
					//Conditional Statement should satisfy debtToIncomeRatio less than 40%.
					if(debtToIncomeRatio < 40.0f) {
						System.out.println("Customer's Debt-to-Income Rtio is: " + debtToIncomeRatio + "%");
						System.out.println("the DTI ratio of Customer's is less than 40%.");
						System.out.println();
						System.out.println("==============================================================");
						System.out.println("Congractulations! " +customerName + ", the loan is approved.");
						System.out.println("==============================================================");
					}
					
					//Conditional Statement should satisfy debtToIncomeRatio is 40% or greater.
					else if(debtToIncomeRatio >= 40.0f) {
						System.out.println("Customer's Debt-to-Income Ratio is: " + debtToIncomeRatio + "%");
						System.out.println("The DTI ratio of Customer's is 40% or greater.");
						System.out.println();
						System.out.println("===============================================");
						System.out.println("Sorry " + customerName + ", the loan is denied.");
						System.out.println("===============================================");
					}
				}
				
				//Conditional Statement should satisfy isEmployed is false.
				else if(isEmployed == false) {
					System.out.println("Employment Status of Customer is: " + isEmployed);
					System.out.println("Customer is Unemployed.");
					System.out.println();
					System.out.println("===============================================");
					System.out.println("Sorry " + customerName + ", the loan is denied.");
					System.out.println("===============================================");
					System.out.println();
				}
				
			}
			
			//Conditional Statement should satisfy income is less than $50,000.
			else if(income < 50000.0f){
				System.out.println("Customer's Income is: $" + income);
				System.out.println("Customer's Income is less than $50,000.");
				System.out.println();
				System.out.println("===============================================");
				System.out.println("Sorry " + customerName + ", the loan is denied.");
				System.out.println("===============================================");
				System.out.println();
			}
		}
		
		//Conditional Statement should satisfy creditScore is less than 650.
		else if(creditScore < 650) {
			System.out.println("Customer's Credit score is: " + creditScore);
			System.out.println("The Credit Score is below 650.");
			System.out.println();
			System.out.println("===============================================");
			System.out.println("Sorry " + customerName + ", the loan is denied.");
			System.out.println("===============================================");
			System.out.println();
		}
		
		
		
		
	}

}
