public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        BestTimetoBuyandSellStockII s = new BestTimetoBuyandSellStockII();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int curProfit = prices[i] - prices[i - 1];
            totalProfit += Math.max(0, curProfit);
        }
        return totalProfit;
    }
}
