package single.linked.list;

import single.linked.list.utils.ListUtils;

public class MergeLinkedLists {
    public static void main(String[] args){
        SingleLinkedList<Node> listOne = ListUtils.readList();
        SingleLinkedList<Node> listTwo = ListUtils.readList();
        System.out.println("List One before merging");
        listOne.print();
        listOne.mergeLists(listTwo);
        System.out.println("List One after merging");
        listOne.print();
    }
}
