public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int maxp = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            if (prices[i] - min > maxp) maxp = prices[i] - min;
        }
        return maxp;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 6, 4, 3, 1};
        System.out.println(maxProfit(prices1));
        int[] prices2 = {};
        System.out.println(maxProfit(prices2));
        int[] prices3 = {1, 2};
        System.out.println(maxProfit(prices3));
    }
}
