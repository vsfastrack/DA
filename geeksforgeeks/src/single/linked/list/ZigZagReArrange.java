package single.linked.list;

import single.linked.list.utils.ListUtils;

public class ZigZagReArrange {
    public static void main(String[] args){
        SingleLinkedList<Node> listOne = ListUtils.readList();
        System.out.println("List before operation is as follows");
        listOne.print();
        listOne.rearrangeInZigZagFashion();
        System.out.println("List after operation is as follows");
        listOne.print();
    }
}
