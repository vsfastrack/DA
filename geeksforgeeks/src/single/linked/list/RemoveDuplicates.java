package single.linked.list;

import single.linked.list.utils.ListUtils;

public class RemoveDuplicates {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
//        System.out.println("The list before removal of duplication ");
//        sll.print();
//        sll.removeDuplicates();
//        System.out.println("The list after removal of duplication ");
//        sll.print();

        System.out.println("The list before removal of duplication ");
        sll.print();
        sll.removeDuplicatesFromUnsorted();
        System.out.println("The list after removal of duplication ");
        sll.print();

    }
}
