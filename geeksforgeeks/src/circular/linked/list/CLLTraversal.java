package circular.linked.list;

import single.linked.list.Node;
import single.linked.list.utils.ListUtils;

public class CLLTraversal {
    public static void main(String[] args){
        CircularLinkedList<Node> circularLinkedList = ListUtils.readCircularList();
        System.out.println("List before operation is as follows");
        circularLinkedList.print();
    }
}
