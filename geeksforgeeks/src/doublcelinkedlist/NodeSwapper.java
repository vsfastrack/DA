package doublcelinkedlist;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class NodeSwapper {
    public static void main(String[] args){
        DoubleLinkedList doubleLinkedList = ListUtils.readDoubleLinkedList();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("Double Linked List is as follows");
        doubleLinkedList.print();
        doubleLinkedList.swapNodes(k);
        System.out.println("Double Linked List after swap is as follows");
        doubleLinkedList.print();
    }
}
