package algorithm;

import java.util.Arrays;

/**
 * 稳定排序，时间复杂度：O(NlogN)， 空间复杂度：O(N)
 */

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {6, 1, 3, 5, 9, 8, 7, 4, 0, 2};


        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr, int left, int right){
        if (left == right){
            return;
        }
        int mid = left + (right - left) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);

    }
    public static void merge(int[] arr, int left, int mid, int right){
        // 创建辅助数组
        int[] help = new int[right - left + 1];
        int i = 0;
        // 左半部分起始位置
        int p1 = left;
        // 右边部分起始位置
        int p2 = mid + 1;
        // 在不越界的条件下，比较哪个部分小
        while (p1 <= mid && p2 <= right){
            if (arr[p1] < arr[p2]){
                help[i ++] = arr[p1 ++];
            }else{
                help[i ++] = arr[p2 ++];
            }
        }
        while (p1 <= mid){
            help[i ++] = arr[p1 ++];

        }
        while (p2 <= right){
            help[i++] = arr[p2 ++];
        }
        for (int ii = 0; ii < help.length; ii++){
            arr[left + ii] = help[ii];
        }

    }


}
