package single.linked.list;

import single.linked.list.utils.ListUtils;

public class MergeLinkedLits {
    public static void main(String[] args){
        SingleLinkedList<Node> sllOne = ListUtils.readList();
        SingleLinkedList<Node> sllTwo = ListUtils.readList();
        System.out.println("Linked list before merging");
        sllOne.print();
        sllTwo.print();
        sllOne.merge(sllTwo);
        System.out.println("Linked list after merging");
        sllTwo.print();
    }
}
