package yuan_fu_dao;

import java.util.ArrayList;
import java.util.List;

/**
 * 最长连续递增序列
 */
public class Longest_Continuous_Increase_Sequence {
    public static ArrayList<Integer> array = new ArrayList<>();

    public static void main(String[] args) {
//        int[] arr = {3, -1, 2, 5, 6, -2, 9, 10};
//       fun(arr);
//       for (int i = 0; i < array.size(); i++){
//           System.out.println(array.get(i));
//       }
       // System.out.println((double)9/2);

       System.out.println(Math.ceil((double)9/2));
       System.out.println(Math.floor(9/2));

    }

    public static ArrayList<Integer> fun(int[] arr) {

        if (arr == null) {
            return array;
        }
        if (arr.length == 1) {
            array.add(arr[0]);
            return array;
        }
        int count = 0;
        int start = 0;
        int maxLen = 0;
        int position = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[start + count] > arr[i]) {
                // 前 > 后，不符合条件，所以count置为0
                count = 0;
                start = i;
            } else {
                count += 1;
            }
            if (maxLen > count) {
                maxLen = maxLen;

            } else {
                // 更新后将坐标赋给position
                maxLen = count;
                position = start;
            }
        }
        /**
         * 填充
         */
        for (int i = position; i <= position + maxLen; i++){
            array.add(arr[i]);
        }
        return array;
    }


}
