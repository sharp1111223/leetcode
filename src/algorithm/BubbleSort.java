package algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5, 7, 4, 9, 11, 10, 43, 6, 8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 冒泡排序 O(n2) O(1)
     */
    public static void Bubble(int[] arr){
        if (arr == null || arr.length < 2){
            return ;
        }
        for (int end = arr.length - 1; end > 0; end--){
            for (int i = 0; i < end; i++){
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }
    public static void selectSort(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++){
            min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
                swap(arr, min, i);

            }
        }
    }
    /**
     * swqp
     */
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void insert(int[] arr){
        for (int i = 1; i < arr.length; i++){
            /**
             * 内层循环的表示：从当前的数往前看，看看可以插入到哪个位置上
             */
            for (int j = i - 1; j >= 0; j--){
                if (arr[j] > arr[j + 1]){
                    swap(arr, i, j);
                }
            }
        }
    }
    public void merge(int[] arr, int left, int right){
        if (left <= right){
            int mid = left + (right - left) / 2;

        }
    }

    public void getMax(int[] arr, int left, int right){
        /**
         * 什么时候不用再进行递归？当left == right时，不需要再递归
         */
        if (left == right){
            return ;
        }
        int mid = left + (right - left) / 2;
        /**
         * 共享取最大值得流程
         */
        getMax(arr, left, mid);
        getMax(arr, mid + 1, right);
        /**
         * 返回结果是什么？左边的最大值和右边最大值，哪个大返回哪个
         */

    }
}

