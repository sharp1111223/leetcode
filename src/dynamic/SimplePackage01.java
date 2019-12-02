package dynamic;

import java.util.Scanner;

public class SimplePackage01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt(); // 背包的容量
        int number = sc.nextInt(); // 总共有多少个数
        int[] value = new int[number];
        int[] weight = new int [number];
        //
        for (int i = 0; i < value.length; i++) {
            value[i] = sc.nextInt();
        }
        //
        for (int i = 0; i < weight.length; i++){
            weight[i] = sc.nextInt();
        }
        System.out.println("max为：" + dynamicMaxValue(capacity, value, weight));


    }

    /**
     * 给定一些物品的价值，并且给定一个背包的容量，要求在背包容量之内，选择具有最大值的物品
     * 每个物品只能选择一次
     * 输入第一行表示输入背包容量，第二行输入多少个数，第三行表示值是多少,第四行表示物品占用的重量
     */
    public static int dynamicMaxValue(int capacity, int[] value, int[] weight) {
        int[][] dp = new int[value.length + 1][capacity + 1]; // 建立dp矩阵
        // 第一行、第一列填0
        for (int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++){
            dp[0][j] = 0;
        }
        //
        for (int i = 1; i < value.length + 1; i++){
            for (int j = 1; j < dp[0].length ; j++){
                if (j - weight[i - 1] >= 0){
                    dp[i][j] = Math.max(dp[i - 1][j], value[i - 1] + dp[i][j - weight[i - 1]]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("\r\n");
        }
        return dp[value.length][capacity];
    }

}
