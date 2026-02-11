class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int price_to_buy=Integer.MAX_VALUE;

        for(int price:prices){
            price_to_buy=Math.min(price_to_buy,price);
            profit=Math.max(profit,price-price_to_buy);
        }
        return profit;
    }
}