class KadanesAlgo {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int buy = 0;
        int profit = 0;
        // int sell = 0;

        for(int i=1; i<size; i++){

            if(prices[i]<prices[buy]){
                buy = i;
            }
            else if(prices[i]-prices[buy]>profit){
                profit = prices[i]-prices[buy];
            }
        }
        return profit;
    }
}

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/4868897/most-optimized-kadane-s-algorithm-java-c-python-rust-javascript/?envType=study-plan-v2&envId=top-interview-150
 * 
 */