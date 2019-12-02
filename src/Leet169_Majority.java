import java.util.HashMap;

public class Leet169_Majority {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!hashmap.containsKey(nums[i])){
                hashmap.put(nums[i], 1);
            }else{
                int count = hashmap.get(nums[i]);
                hashmap.put(nums[i], count + 1);
            }

            if (hashmap.get(nums[i]) >= nums.length /2){
                return hashmap.get(nums[i]);
            }
        }

        return 0;
    }
}
