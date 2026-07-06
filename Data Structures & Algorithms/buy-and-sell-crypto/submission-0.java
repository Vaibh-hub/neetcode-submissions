class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       int minprice = prices[0];
       for(int i  = 1; i<prices.length;i++){
        if(prices[i]<minprice){
            minprice = prices[i];
        }
        profit = Math.max(profit,prices[i]-minprice);
       }
       return profit; 
    }
}
