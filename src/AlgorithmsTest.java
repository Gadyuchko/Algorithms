import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmsTest {

    public static void main(String[] args) {
            int[] ints1 = {0, 2, 3};
            int[] ints2 = {0, 1, 2, 3};
            int[] ints3 = {1, 2, 3};
            int[] ints4 = {0, 3, 4};
            int[] ints5 = {7, 8, 9, 10, 11, 12};
            int[] ints6 = {3, 4, -1, 1};
            int[] ints7 = {-1, -2, -3};
            int[] ints8 = {8};
            int[] ints9 = {1, 0};
            int[] r = {-1,-1,0,0,-1,-1};
            String s= "bar";
            String t= "foo";
            String j = "rty";
            String e ="ry";
            String g = "ryghjt";

            ListNode list1_n3 = new ListNode(4);
            ListNode list1_n2 = new ListNode(3,list1_n3);
            ListNode list1_n1 = new ListNode(1,list1_n2);

            ListNode list2_n3 = new ListNode(6);
            ListNode list2_n2 = new ListNode(3,list2_n3);
            ListNode list2_n1 = new ListNode(1,list2_n2);

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

//            Node A = new Node(1, new ArrayList<>(Arrays.asList(B,C,D)));
            Node A = null;
            TreeTraversal tree = new TreeTraversal();

            TreeNode GG =new TreeNode(12);
            TreeNode HH =new TreeNode(2);
            TreeNode JJ =new TreeNode(4);
            TreeNode KK =new TreeNode(9);
            TreeNode LL =new TreeNode(1);
            TreeNode ZZ =new TreeNode(7);
            TreeNode XX =new TreeNode(3,HH,GG);
            TreeNode CC =new TreeNode(5,JJ,null);
            TreeNode VV =new TreeNode(2,LL,KK);
            TreeNode BB =new TreeNode(6,XX,ZZ);
            TreeNode NN =new TreeNode(4,VV,CC);
            TreeNode MM =new TreeNode(5,NN,BB);

            String [] strings ={e,t, j,s};
//            System.out.println(FirstMissingPositive.firstMissingPositive(ints3));
//            System.out.println(PivotIndex.pivotIndex(ints9));
//            System.out.println(IsIsomorphic.isIsomorphic(s, t));
//            System.out.println(Subsequence.isSubsequence(j,g));
//            System.out.println(MergeTwoLists.mergeTwoLists(list1_n1,list2_n1));

//            System.out.println(tree.preorder(A));
//            System.out.println("=============================");
//            System.out.println(tree.preOrderIterative(A));
//            System.out.println("=============================");
//            System.out.println(tree.levelOrder(MM));
//            System.out.println(BinarySearchTree.isValidBST(MM));
            System.out.println(FibonacciNumbers.fib(0));
//            System.out.println(BinarySearch.search(ints8, 8));
            
    }
}
