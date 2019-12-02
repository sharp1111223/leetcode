import java.util.PriorityQueue;

/**
 * Topk问题：数据流依次进入一个数组里，求当前数组的第k大值
 * 思路：利用优先队列priorityQueue来解决
 */
public class TopK {
    PriorityQueue<Integer> queue ;
    int k;
    public TopK(int k, int[] nums){
        this.k = k;
        queue = new PriorityQueue<>();
        for (int n : nums){
            add(n);

        }

    }

    public int add(int val){
        if (queue.size() < k){
            // 队列的容量小于k
            queue.offer(val);
        }else if (queue.peek() < val){
            queue.poll();
            queue.offer(val);

        }
        return queue.peek();

    }
}
