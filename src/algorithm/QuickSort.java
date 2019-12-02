package algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 5, 9, 8, 7, 4, 0};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

    public static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int j = partition(arr, left, right);
        sort(arr, left, j - 1);
        sort(arr, j + 1, right);

    }

    public static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int temp = arr[left];

        while (i < j) {
            while (arr[j] >= temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }
            exch(arr, i, j);
        }
        // 基准元素和切分元素交换
        exch(arr, left, i);
        return i;

    }

    public static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
