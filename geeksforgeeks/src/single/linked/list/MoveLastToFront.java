package single.linked.list;

import single.linked.list.utils.ListUtils;

public class MoveLastToFront {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        sll.moveLastToFront();
        System.out.println("List after operation ");
        sll.print();
    }
}
