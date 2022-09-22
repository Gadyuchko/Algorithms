import java.util.Stack;

public class BinarySearchTree {

    public static void main(String[] args) {
        TreeNode GG =new TreeNode(12);
        TreeNode HH =new TreeNode(1);
        TreeNode JJ =new TreeNode(2,HH,null);

        TreeNode n_14 =new TreeNode(14);
        TreeNode n_10 =new TreeNode(10);
        TreeNode n_2 =new TreeNode(2);
        TreeNode n_17 =new TreeNode(17,null,null);
        TreeNode n_12 =new TreeNode(12,n_10,n_14);
        TreeNode n_20 =new TreeNode(20,n_17, null);
        TreeNode n_7 =new TreeNode(7,n_2,n_12);
        TreeNode n_15 =new TreeNode(15,n_7,n_20);

        System.out.println(lowestCommonAncestor(n_15, n_2, n_14));
        System.out.println(lowestCommonAncestor(JJ, HH, JJ));
    }

    static boolean isValidBST(TreeNode root) {
        boolean flag = true;
        if(root == null){
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode previous = null;

        while(current!=null || stack.size()>0){
            while(current!=null) {
                stack.push(current);
                    if (current.left!=null && current.left.val > current.val) {
                        flag = false;
                        break;
                    } else {
                        current = current.left;
                    }

            }
            current=stack.pop();
            if (previous!=null && current!=null) {
                if (current.val <= previous.val) {
                    flag = false;
                    break;
                }

            }if (current!=null){
                previous=current;
            }
            current = current.right;
        }return flag;
    }

    static int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode current = stack.pop();
            if(current.val > p.val && current.val > q.val && current.left != null){
                stack.push(current.left);
            }else if(current.val < p.val && current.val < q.val && current.right != null){
                stack.push(current.right);
            }
            lca = current;
        }return lca.val;
    }
}
