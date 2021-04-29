package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class NthNodeFromEnd {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node resultNode = sll.findNthNodeFromEnd(n);
        if(resultNode != null)
            System.out.println("The element at nth position from end is =  " + sll.findNthNodeFromEnd(n).getData());
        else
            System.out.println("The element at nth position from end is =  "+null);
    }
}
