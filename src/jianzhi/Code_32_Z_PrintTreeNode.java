package jianzhi;


import java.util.ArrayDeque;
import java.util.Deque;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

/**
 * 之字形打印二叉树
 */
public class Code_32_Z_PrintTreeNode {
    public static void main(String[] args) {


    }

    public static void fun(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        boolean flag = true;
        deque.add(root);
        int count = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            // 计数方式
            for (int i = 0; i < size; i++){
                TreeNode help = deque.pollFirst();

                if (flag) {
                    if (help.left != null) {
                        deque.offerFirst(help.left);

                    }
                    if (help.right != null){
                        deque.offerFirst(help.right);

                    }
                }else{
                    if (help.right != null) {
                        deque.offerLast(help.left);

                    }
                    if (help.left != null){
                        deque.offerLast(help.right);

                    }
                }

            }
            flag = !flag;
        }
    }
}
