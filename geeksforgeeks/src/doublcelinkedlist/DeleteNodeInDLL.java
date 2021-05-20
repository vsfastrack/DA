package doublcelinkedlist;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class DeleteNodeInDLL {
    public static void main(String[] args){
        DoubleLinkedList doubleLinkedList = ListUtils.readDoubleLinkedList();
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println("Double Linked List is as follows");
        doubleLinkedList.print();
        doubleLinkedList.delete(key);
        System.out.println("Double Linked List after deletion is as follows");
        doubleLinkedList.print();
    }
}
