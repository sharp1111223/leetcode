package algorithm;

// valatile
import java.util.Arrays;

import static algorithm.BubbleSort.swap;

public class QuickSort2 {

    public static void sort(int[] arr, int left, int right){

        if (left < right){
            // 将划分元素与最后一个数做交换，默认以最后一个数作为划分元素
            swap(arr, left +  (int)(Math.random() * (right - left + 1)), right);
            int[] p = partition(arr, left, right); // p数组表示记录的位置
            sort(arr, left, p[0] - 1);
            sort(arr, p[1] + 1, right);
        }
    }
    public static int[] partition(int[] arr, int left, int right){
        int less = left - 1; // 小于划分值得区域位于左边
        int more = right;  // 大于划分值得区域的边界包含最右边的元素, more为大于区域的第一个数
        while (left < more){
            if (arr[left] < arr[right]){
                swap(arr, ++less, left++);
            }else if (arr[left] > arr[right]){
                swap(arr, --more, left);
            }else {
                left ++;
            }
        }
        swap(arr, more, right);

        return new int[] {less + 1, more};

    }

    public static void main(String[] args){
        int[] arr = {6, 1, 4};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }


}
