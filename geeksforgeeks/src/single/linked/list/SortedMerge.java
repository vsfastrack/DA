package single.linked.list;

import single.linked.list.utils.ListUtils;

public class SortedMerge {
    public static void main(String[] args){
        SingleLinkedList<Node> sllOne = ListUtils.readList();
        SingleLinkedList<Node> sllTwo = ListUtils.readList();
        Node resultNode = sllOne.sortedMerge(sllTwo);
    }
}
