package single.linked.list;

import single.linked.list.utils.ListUtils;

public class ListIntersection {
    public static void main(String[] args){
        SingleLinkedList<Node> sllOne = ListUtils.readList();
        SingleLinkedList<Node> sllTwo = ListUtils.readList();
        SingleLinkedList<Node> sllResult = sllOne.intersectionOfLists(sllTwo);
        System.out.println("Intersection of Lists");
        sllResult.print();
    }
}
