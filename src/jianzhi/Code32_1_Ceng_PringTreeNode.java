package jianzhi;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 按层级打印二叉树
 */
public class Code32_1_Ceng_PringTreeNode {
    public static void printTreeNode(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {

                TreeNode help = queue.poll();
                System.out.print(help.val + " ");

                if (help.left != null) {
                    queue.offer(help.left);
                }
                if (help.right != null) {
                    queue.offer(help.right);
                }
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.right = new TreeNode(6);
        // head.left.left.right = new TreeNode(7);
        printTreeNode(head);

    }
}
