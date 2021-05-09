package single.linked.list;

import single.linked.list.utils.ListUtils;

public class AlternateSplit {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        sll.print();
        Node [] result = sll.alternateSplit();
        System.out.println("First List");
        sll.print(result[0]);
        System.out.println("Second List");
        sll.print(result[1]);
    }
}
