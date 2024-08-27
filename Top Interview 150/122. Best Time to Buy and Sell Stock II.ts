function maxProfit(prices: number[]): number {
    let buyPrice = prices[0];
    let profit = 0;

    for (let i = 1; i < prices.length; i++) {
        if (prices[i] < buyPrice) {
            buyPrice = prices[i];
        }

        if (prices[i] - buyPrice > 0) {
            profit += prices[i] - buyPrice;
            buyPrice = prices[i];
        }
    }

    return profit;
}
