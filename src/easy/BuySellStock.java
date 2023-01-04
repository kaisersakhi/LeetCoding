package easy;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//You are given an array prices
// where prices[i] is the price of a given stock on the ith day.
public class BuySellStock {
    public static void main(String[] args) {
        System.out.println(getProfit(new int[]{2, 4, 1}));
        System.out.println(getProfit(new int[]{0}));
        System.out.println(getProfit(new int[]{5,4,3,1}));
        System.out.println(getProfit(new int[]{7,1,5,6,4}));
    }

    static int getProfit(int[] prices) {
        //save lowest price of the stock
        //calculate the profit if we are selling on ith day
        //store in heightProfit if is greater than previous profit
        int lowestPriceYet = prices[0];
        int heightProfitYet = 0;
        for (int price : prices) {
            lowestPriceYet = Math.min(price, lowestPriceYet);
            heightProfitYet = Math.max(price - lowestPriceYet, heightProfitYet);
        }
        return heightProfitYet;
    }

}
