package Array;

public class Stocks {
    
    public static int buyOrSellStocks(int prices[]){
        int maxProfit =0;
        // buyPrice is +oo
        int buyPrice = Integer.MAX_VALUE;
        
        //loop
        for(int i=0; i<prices.length; i++){
            //case-1
            if(buyPrice < prices[i]){
                //calculate profit
                int profit =  prices[i] -buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                //case-2
                buyPrice= prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 8,7,6,3,2,1,0};
        System.out.println(buyOrSellStocks(prices));
    }
}
