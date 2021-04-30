package single.linked.list;

import single.linked.list.utils.ListUtils;

public class SwapPairwise {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        sll.swapPairwiseElements();
        System.out.println("List after swapping elements ");
        sll.print();
    }
}
