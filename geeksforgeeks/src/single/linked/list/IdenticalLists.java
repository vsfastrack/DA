package single.linked.list;

import single.linked.list.utils.ListUtils;

public class IdenticalLists {
    public static void main(String[] args){
        SingleLinkedList<Node> sllOne = ListUtils.readList();
        SingleLinkedList<Node> sllTwo = ListUtils.readList();
        System.out.println("The lists are identical " +sllOne.areListsIdentical(sllTwo));
    }
}
