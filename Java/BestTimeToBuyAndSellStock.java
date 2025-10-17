class Solution {
    public int maxProfit(int[] prices) {
        int price = 0;
        int high = 0;
        for (int i = prices.length - 1; i >= 0; i--) { 
            if (prices[i] > high) {
                high = prices[i];
            } else if (high - prices[i] > price) {
                price = high - prices[i];
            }
        }
        return price;
    }
}
