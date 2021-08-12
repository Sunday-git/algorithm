package PrimaryAlgorithm.array;

/**
 * @author zqs
 * @create 2021-08-05 19:50
 */

import org.junit.Test;

/**
 * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class Array_Test2 {

    //1 2 1 4 5
    public int maxProfit(int[] prices) {

        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            sum += Math.max(prices[i + 1] - prices[i], 0);
        }
        return sum;
    }

    @Test
    public void testMaxProfit() {
//        int[] prices = new int[]{1,2,1,4,5};
//        int[] prices = new int[]{1,2,3,4,5};
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int sum = maxProfit(prices);
        System.out.println(sum);
    }
}
