public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode list1_n3 = new ListNode(9);
        ListNode list1_n2 = new ListNode(8,list1_n3);
        ListNode list1_n1 = new ListNode(5,list1_n2);

        ListNode list2_n3 = new ListNode(3 , list1_n1);
        ListNode list2_n2 = new ListNode(3,list2_n3);
        ListNode list2_n1 = new ListNode(1,list2_n2);

        print(middleNode(list2_n1));

    }
    static void print (ListNode listNode){
        System.out.println(listNode.val);
        if (listNode.next !=null){
            print(listNode.next);
        }
    }
    static ListNode middleNode(ListNode head) {
        // set up temp var for pointer
        ListNode pointer = new ListNode();
        pointer = head;
        int counter = 0;

        // find size of list by traversing it
        while(pointer!=null){
            counter +=1;
            pointer=pointer.next;
        }

        // middle will be half + 1
        counter = counter/2+1;

        // find node at middle by traversing to it
        while(counter>1){

                head=head.next;
                counter -= 1;
        }
        return head;
    }
}
