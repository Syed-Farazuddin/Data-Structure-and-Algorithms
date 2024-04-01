package Arrays.problems;

public class BestTimeToSellStocks {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0;
        for(int i = 0; i < prices.length ; i++){
            profit = 0;
            for(int j = i+1 ; j < prices.length ; j++){
                profit = prices[j] - prices[i];
                maxProfit = Math.max(profit,maxProfit);
            }
        }return maxProfit;
    }
}
