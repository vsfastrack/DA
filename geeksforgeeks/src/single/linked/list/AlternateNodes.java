package single.linked.list;

import single.linked.list.utils.ListUtils;

public class AlternateNodes {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        System.out.println("List before rearrangement");
        sll.print();
        sll.alternateEvensAndOddsReArrangement();
        System.out.println("List after rearrangement");
        sll.print();
    }
}
