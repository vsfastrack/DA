package single.linked.list;

import single.linked.list.utils.ListUtils;

public class AlternateDeleteNodes {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        System.out.println("-----Before removal list ----");
        sll.print();
        sll.deleteAlternateNodes();
        System.out.println("-----After removal list ----");
        sll.print();
    }
}
