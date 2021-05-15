package single.linked.list;

import single.linked.list.utils.ListUtils;

public class AddNumberToLL {
    public static void main(String[] args){
        SingleLinkedList<Node> listOne = ListUtils.readList();
        System.out.println("List before operation is as follows");
        listOne.print();
        listOne.addNumberToList(1);
        System.out.println("List after operation is as follows");
        listOne.print();
    }
}
