package circular.linked.list;

import single.linked.list.Node;
import single.linked.list.utils.ListUtils;

public class CircularSplit {
    public static void main(String[] args){
        CircularLinkedList<Node> listOne = ListUtils.readCircularList();
        System.out.println("List before operation is as follows");
        listOne.print();
        Node [] resultPtr = listOne.splitInTwoHalves();
        System.out.println("First List is as follows");
        listOne.print(resultPtr[0]);
        System.out.println("Second List is as follows");
        listOne.print(resultPtr[1]);
    }
}
