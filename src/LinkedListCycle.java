import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        ListNode n4 = new ListNode(4 );
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n5;

        System.out.println(detectCycle(n1));
    }

    static ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if(head!=null && head.next!=null){
            while(head!=null && !set.contains(head)){
                set.add(head);
                head=head.next;
            }return head;
        }return null;

    }
}
