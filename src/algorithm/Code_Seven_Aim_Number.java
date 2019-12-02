package algorithm;

public class Code_Seven_Aim_Number {
    public static void main(String[] args){


    }
    public boolean isAimNumber(int[] arr, int target){
        int i = 0;
        int sum = 0;
        return process(arr, i, sum, target);
    }

    private boolean process(int[] arr, int i, int sum, int aim) {
        if (i == arr.length){
            return sum == aim;
        }
        return (process(arr, i + 1, sum, aim)) || (process(arr, i + 1, sum + arr[i], aim));
    }
}
