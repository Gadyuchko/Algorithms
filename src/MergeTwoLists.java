public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode list1_n3 = new ListNode(3);
        ListNode list1_n2 = new ListNode(3,list1_n3);
        ListNode list1_n1 = new ListNode(1,list1_n2);

        ListNode list2_n3 = new ListNode(3);
        ListNode list2_n2 = new ListNode(3,list2_n3);
        ListNode list2_n1 = new ListNode(1,list2_n2);

        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode(1);


        print(mergeTwoLists(n1,n2));

    }

    static void print (ListNode listNode){
        System.out.println(listNode.val);
        if (listNode.next !=null){
            print(listNode.next);
        }
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
