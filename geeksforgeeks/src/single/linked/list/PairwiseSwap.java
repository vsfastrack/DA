package single.linked.list;

import single.linked.list.utils.ListUtils;

public class PairwiseSwap {
    public static void main(String[] args){
        SingleLinkedList<Node> list = ListUtils.readList();
        System.out.println("List before swap operation is as follows");
        list.print();
        list.swapPairwise();
        System.out.println("List after pairwise swap is as follows");
        list.print();
    }
}
