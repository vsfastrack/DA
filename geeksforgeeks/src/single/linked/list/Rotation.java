package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args){
        SingleLinkedList<Node> list = ListUtils.readList();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("List before rotation is as follows");
        list.print();
        list.rotate(k);
        System.out.println("List after rotation is as follows");
        list.print();
    }
}
