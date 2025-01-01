class Solution {

    public static void main(String[] args){
        int [] priceArr = {1, 3, 4, 5, 9, 1, 4, 6, 2};
        System.out.println("The max profit that can be made here is "+ maxProfit(priceArr));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i<prices.length-1; i++){
            if(prices[i+1]-prices[i]>0){
                profit += prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150