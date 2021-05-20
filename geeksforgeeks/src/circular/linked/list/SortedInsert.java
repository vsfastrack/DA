package circular.linked.list;

import single.linked.list.Node;
import single.linked.list.utils.ListUtils;

public class SortedInsert {
    public static void main(String[] args){
        CircularLinkedList<Node> listOne = ListUtils.readSortedCircularList();
        System.out.println("Sorted Circular List is as follows");
        listOne.print();
    }
}
