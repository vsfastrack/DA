package single.linked.list;

import single.linked.list.utils.ListUtils;

public class SortList {
    public static void main(String[] args){
        SingleLinkedList<Node> list = ListUtils.readList();
        System.out.println("List before sorting is as follows");
        list.print();
        list.sort();
        System.out.println("List before sorting is as follows");
        list.print();
    }
}
