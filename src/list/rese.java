package list;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}


public class rese {


    public ListNode resverseListNode(ListNode root){
        HashSet<Integer> hashSet = new HashSet<>();
        Iterator iterator = hashSet.iterator();

        ListNode pre = null;
        while (root != null){
            ListNode pNext = root.next;
            root.next = pre;
            pre = root;
            root = pNext;
        }
        return root;
    }
    public static int binarySearch(int[] arr, int target){
        int res = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                res = mid;
                break;
            }else if (arr[mid] < target){
                left = mid;
            }else{
                right = mid;
            }
        }
        return res;
    }

}
