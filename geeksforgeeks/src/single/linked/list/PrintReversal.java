package single.linked.list;

import single.linked.list.utils.ListUtils;

public class PrintReversal {
    public static void main(String[] args){
        SingleLinkedList sll = ListUtils.readList();
        sll.printReverse();
    }
}
