import java.util.*;

public class TreeTraversal {

    Node G = new Node(7);

    Node H = new Node(8, new ArrayList<>(Arrays.asList(G)));


    Node D = new Node(1, new ArrayList<>(Arrays.asList(H)));

    Node I = new Node(3);
    Node L = new Node(3);
    Node J = new Node(4, new ArrayList<>(Arrays.asList(L,I)));

    Node C = new Node(5, new ArrayList<>(Arrays.asList(J)));



    Node E = new Node(2);
    Node F = new Node(3);
    Node P = new Node(5, new ArrayList<>(Arrays.asList(E,F)));
    Node M = new Node(4);
    Node B = new Node(1, new ArrayList<>(Arrays.asList(M,P)));

    Node A = new Node(1, new ArrayList<>(Arrays.asList(B,C,D)));
    List<Integer> preOrder = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println();
    }

    public List<Integer> preorder(Node root) {

        if(root==null){
            return preOrder;
        }
        preOrder.add(root.val);
        if(root.children != null && !root.children.isEmpty()){
            root.children.forEach(this::preorder);
        }


        return preOrder;
    }

    public List<Integer> preOrderIterative(Node node){
        Stack<Node> nodeStack = new Stack<>();
        if(node==null){
            return preOrder;
        }
        nodeStack.push(node);
        while (!nodeStack.empty()) {
            Node currentNode = nodeStack.pop();
            preOrder.add(currentNode.val);
            if (currentNode.children != null && !currentNode.children.isEmpty()) {
                for(int i =currentNode.children.size()-1; i>=0; i--){
                    nodeStack.push(currentNode.children.get(i));
                }
            }
        }return preOrder;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> preOrder2 = new ArrayList<>();
        if(root==null){
            return preOrder2;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            int y=nodeQueue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i= 0; i<y; i++) {
                TreeNode currentNode = nodeQueue.remove();
                temp.add(currentNode.val);
                if (currentNode.left != null) {
                    nodeQueue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    nodeQueue.add(currentNode.right);
                }
            }preOrder2.add(temp);
        }return preOrder2;
    }
}
