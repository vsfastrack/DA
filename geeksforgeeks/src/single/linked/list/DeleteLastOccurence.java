package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class DeleteLastOccurence {
    public static void main(String[] args){
        SingleLinkedList<Node> listOne = ListUtils.readList();
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("List before operation is as follows");
        listOne.print();
        listOne.deleteLastOccurence(key);
        System.out.println("List after operation is as follows");
        listOne.print();
    }
}
