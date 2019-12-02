package Basic;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 6;
        System.out.println(binarySearch2(arr, 0, arr.length - 1, k));

    }

    private static int binarySearch(int[] arr, int left, int right, int k) {
        if (left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] > k){
            return binarySearch(arr, left, mid, k);
        }else if (arr[mid] < k){
            return binarySearch(arr, mid, right, k);
        }else{
            return mid;
        }
    }
    private static int binarySearch2(int[] arr, int left, int right, int k){
        int mid = 0;
        int res = -1;
        while (left < right){
              mid = left + (right - left) / 2;
             if (arr[mid] > k){
                 right = mid - 1;
             }else if (arr[mid] < k){
                 left = mid + 1;
             }else{
                 return  mid;
             }
        }
        return res;
    }
}
