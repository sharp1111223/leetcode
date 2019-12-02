package jianzhi;

/**
 * 给定数组，求此数组是否是二叉搜索树后序遍历的值
 */
public class Code33_Sequence_PostOrder {
   public static boolean fun(int[] sequence, int low, int high){
       if (sequence.length == 0 || high <= 0){
           return false;
       }

       int num = sequence[high];
       int i = low;
       for (; i < high; i++){
           if (sequence[i] > num){
               break;
           }
       }
       int j = i;
       for (; j < high; j++){
           if (sequence[j] < num){
               return false;
           }
       }
       boolean left = true;
       if (i > low) {
           fun(sequence,low, i - 1);
       }
       boolean right = true;
       if (i <= high){
           right = fun(sequence, i , high - 1);
       }
       return left && right;
   }
   public static void main(String[] args){
      int[] arr = {7,4,6,5};
      System.out.print(fun(arr, 0, arr.length - 1));

   }
}
