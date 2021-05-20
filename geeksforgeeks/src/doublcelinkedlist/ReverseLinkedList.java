package doublcelinkedlist;

import single.linked.list.utils.ListUtils;

public class ReverseLinkedList {
    public static void main(String[] args){
        DoubleLinkedList doubleLinkedList = ListUtils.readDoubleLinkedList();
        System.out.println("Double Linked List is as follows");
        doubleLinkedList.print();
        doubleLinkedList.reverse();
        System.out.println("Double Linked List after reversal is as follows");
        doubleLinkedList.print();
    }
}
