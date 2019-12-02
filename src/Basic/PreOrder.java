package Basic;

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

/**
 * 递归前序遍历
 */
public class PreOrder {
    public static void main(String[] args){

        TreeNode root = new TreeNode(0);
        preOrder(root);
    }

    private static void preOrder(TreeNode root) {
        if (root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);

    }
}
