package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class SwapNodes {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("List before swapping");
        sll.print();
        sll.swap(n , m);
        System.out.println("List after swapping");
        sll.print();
    }
}
