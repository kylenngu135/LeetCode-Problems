int maxProfit(int* prices, int pricesSize) {

    int max = 0;
    int high = 0;

    for (int i = pricesSize - 1; i >= 0; i--) {
        if (prices[i] > high) {
            high = prices[i];
        } else if (high - prices[i] > max) {
            max = high - prices[i];
        }
    }

    return max;
}
