package greedy;

public class Leet122_BuyStock {
    /**
     * leetcode122：买卖股票的最大利润
     * 给定数组表示每一天的股票价格，每天可以买入或者卖出股票无数次(重点)，而且自己持有的股票最多为1股
     * 举例prices = [7 1 5 3 6 4]，最大利润为7，因为第一天价格为7不买，第二天为1买入，第三天为5卖出，所以赚取利润为4元，以此类推
     * 因为每天的股票可以买卖无数次，所以可以用贪心算法，求每天的最大收益，利用一个for循环遍历数组，如果后一天的值要大于前一天，那么
     * 将此利润保存下来（即取当前的最大利润值）
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++){
            if (prices[i + 1] > prices[i]){
                sum += prices[i + 1] - prices[i];
            }
        }
        return sum;

    }
    public static void main(String[] args){


    }
}
