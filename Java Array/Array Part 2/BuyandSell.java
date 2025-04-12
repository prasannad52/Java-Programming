
public class BuyandSell {

    public static int result(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buy_price < prices[i]) { // always selling price is greater than buying price
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = prices[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = {1, 2, 3, 4, 5, 6};
        System.out.println(result(prices));
    }
}
