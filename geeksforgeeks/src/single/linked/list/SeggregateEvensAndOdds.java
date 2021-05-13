package single.linked.list;

import single.linked.list.utils.ListUtils;

public class SeggregateEvensAndOdds {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        System.out.println("List before operation");
        sll.print();
        System.out.println("List after operation");
        sll.seggreagateEvenAndOddNodes();;
        sll.print();
    }
}
