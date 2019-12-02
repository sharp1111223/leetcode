package algorithm;

import java.util.*;

public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String illegal = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < illegal.length(); i++) {
            sb.insert(i, "*");
        }

//            StringBuilder legal = new StringBuilder();
//            for(int i = 0; i <= illegal.length() - 1; i++) {
//                legal.insert(i, '*');
//            }
//            System.out.println(input.replace(illegal, legal));


    }

    public int[] calcute(int[][] w, int[] order) {
        LinkedList<Integer> temp = new LinkedList<>();
        for (int i = 0; i < order.length; i++) {
            temp.offer(order[i]);
        }

        int[] res = new int[order.length];
        int k = 0;

        while (!temp.isEmpty()) {
            for (int i = 0; i < temp.size(); i += 2) {
               int start = temp.get(i);
               int end = temp.get(i + 1);
               if (compare(start, end, w)){
                   // 前项大于后项
                   res[k++] = temp.remove(i);
               }else{
                   res[k++] = temp.remove(i + 1);
               }
            }


        }
        return res;
    }

    private boolean compare(int start, int end, int[][] w) {
        if (w[start][end] == start) {
            return true;
        }
        return false;
    }

}
