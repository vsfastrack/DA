package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class Intersection {
    public static void main(String[] args){
        SingleLinkedList<Node> sllOne = ListUtils.readList();
        SingleLinkedList<Node> sllTwo = ListUtils.readList();
        Scanner scanner = new Scanner(System.in);
        int listOnePosition = scanner.nextInt();
        int listTwoPosition = scanner.nextInt();
        sllOne.intersect(sllTwo , listOnePosition , listTwoPosition);
        Node commonNode = sllOne.findIntersection(sllTwo);
        if(commonNode != null)
            System.out.println("Common node is as follows = "+commonNode.getData());
    }
}
