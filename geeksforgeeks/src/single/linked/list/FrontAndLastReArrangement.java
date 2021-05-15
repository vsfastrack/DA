package single.linked.list;

import single.linked.list.utils.ListUtils;

public class FrontAndLastReArrangement {
    public static void main(String[] args){
        SingleLinkedList<Node> list = ListUtils.readList();
        System.out.println("List before operation is as follows");
        list.print();
        list.reAranageLastAndFront();
        System.out.println("List after operation is as follows");
        list.print();
    }
}
