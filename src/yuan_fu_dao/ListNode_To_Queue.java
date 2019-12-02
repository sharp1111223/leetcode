package yuan_fu_dao;

/**
 * 链表实现队列
 */
public class ListNode_To_Queue {
    ListNode node = null;
    ListNode help = node; // 辅助链表节点

    /**
     * 构造方法
     */
    ListNode_To_Queue() {
        new ListNode(0);
        new ListNode(0);

    }

    /**
     * put
     */
    public void push(int num) {
        ListNode dummy = new ListNode(num);
        if (node == null) {
            node = dummy;
            help = dummy;
        } else {
            dummy.next = help;
            help = dummy;
        }
    }

    /**
     *
     */
    public int pop() {
        if (help == null) {
            throw new RuntimeException("your queue is empty");
        }
        ListNode dummy = new ListNode(0);

        int res = help.val;
        help = help.next;
        return res;
    }

    /**
     * peek()
     */
    public int peek() {
        if (help == null) {
            throw new RuntimeException("the queue is null");
        } else {
            return help.val;
        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int num) {
        this.val = num;
    }

}

