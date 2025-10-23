package assignment11;

public class BuyAndSell {

	public static void main(String[] args) {
		int prices[] = {4, 6, 3, 2, 7, 8};
        int days = prices.length;
        int buyDay = 0;
        int sellDay = 0;
        int finalProfit = 0;
        int buyPrice = 0;
        int sellPrice = 0;
        
        //Outer for loop used for buyDay from the prices[] array
        for(int i = 0; i < days - 1; i++) {
            
        	//Inner for loop is used for sellDay from the prices[] array
            for(int j = i+1; j < days; j++) {
            	
            	//checkingProfit is used to get the present profit from the loop
                int checkingProfit = prices[j] - prices[i];
                
                //Shifting the maximum profit value to the finalProfit from the checkingProfit
                if(checkingProfit > finalProfit) {
                    finalProfit = checkingProfit;
                    
                    buyDay = i+1;
                    buyPrice = prices[i];
                    sellDay = j+1;
                    sellPrice = prices[j];
                }
            }
        }
        
        System.out.println("Buy Day: " + buyDay + " - Buy Price: " + buyPrice);
        System.out.println("Sell Day: " + sellDay + " - Sell Price: " + sellPrice);
        System.out.println("Maximum Profit: " + finalProfit);

	}

}
