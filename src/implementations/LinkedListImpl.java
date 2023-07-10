package implementations;

public class LinkedListImpl<E> {
    int size = 0;
    private Node<E> head;
    private Node<E> tail;

    public LinkedListImpl() {
    }

    // node with pointer to previous node and next node and data
    private static class Node<E>{
        E item;
        LinkedListImpl.Node<E> next;
        LinkedListImpl.Node<E> prev;

        Node(LinkedListImpl.Node<E> prev, E element, LinkedListImpl.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    // main operations

    // add first
    private void addFirst(E e){
        final Node<E> temp_head = head;
        final Node<E> new_head = new LinkedListImpl.Node<E>(null,e,head);
        head = new_head;
        if(temp_head==null)
            tail=new_head;
        else
            tail.prev=new_head;
        size++;
    }

    // add last
    void addLast(E e){
        final Node<E> temp_tail = tail;
        final Node<E> new_tail = new Node<E>(tail,e,null);
        tail = new_tail;
        if(temp_tail == null)
            head = new_tail;
        else
           temp_tail.next=new_tail;
    }
    // add before

    void addBefore(E e, Node<E> successor){
        final var temp_prev = successor.prev;
        final var new_prev = new Node<E>(temp_prev,e,successor);
        successor.prev=new_prev;
        if(temp_prev==null)
            head=new_prev;
        else
            temp_prev.next=new_prev;
        size++;
    }


    // remove first

    E removeFirst(Node<E> f){
        final var temp_head = head.next;
        final var item = f.item;
        f.item=null;
        f.next=null;
        if(temp_head==null)
            tail=null;
        else
            head.prev=null;
        size--;
        return item;
    }

    // remove last
    E removeLast(Node<E> l){
        final var temp_tail = tail.prev;
        final var item =l.item;
        l.prev=null;
        l.item=null;
        tail=temp_tail;
        if(temp_tail==null)
            head=null;
        else
            temp_tail.next=null;
        size--;
        return item;
    }
    // remove node

    E remove(Node<E> e){
        final var item = e.item;
        final Node<E> prev = e.prev;
        final Node<E> next = e.next;
        e.item=null;
        e.next=null;
        e.prev=null;
        if(prev==null){
            head=next;
        }else {
            prev.next=next;
        }

        if (next==null) {
            tail = prev;
        }else{
            next.prev=prev;
        }
        size--;
        return item;
    }
}
