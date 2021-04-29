package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class NthNode {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The element at nth position is =  " + sll.findNthNode(n).getData());
    }
}
