public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode list1_n3 = new ListNode(9);
        ListNode list1_n2 = new ListNode(8,list1_n3);
        ListNode list1_n1 = new ListNode(5,list1_n2);

        ListNode list2_n3 = new ListNode(3 , list1_n1);
        ListNode list2_n2 = new ListNode(3,list2_n3);
        ListNode list2_n1 = new ListNode(1,list2_n2);

        print(reverseList(list2_n1));

    }
    static void print (ListNode listNode) {
        System.out.println(listNode.val);
        if (listNode.next != null) {
            print(listNode.next);
        }
    }
    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode current =head;
        while(current!=null){
           next = current.next;
           current.next=prev;
           prev=current;
           current=next;

        }return prev;
    }
}
