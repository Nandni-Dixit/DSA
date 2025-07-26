package DSA.Arrays;

public class BuySellStocks {

    public static int buySellStock(int[] stockPrices,int size){
    
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        

        for(int i=0;i<size;i++){
            if(buyingPrice<stockPrices[i]){ //If the buying price is less then selling price i.e the current index price
                int profit = stockPrices[i]-buyingPrice; // we find the prfit if we sell the stock today
                maxProfit = Math.max(maxProfit, profit); //we compare todayd profit with the earlier stord max profit and store it int max profit
            }else{ //If the buying price is less then selling price i.e the current index price
                buyingPrice = stockPrices[i]; //Then we make the the current array price as the new buying price
            }
        }

        

        return maxProfit;
    }
    
    public static void main(String[] args) {
        int n =6;
        int[] stockPrices ={7,1,5,3,6,4};
        System.out.println(buySellStock(stockPrices, n));
    }
}
