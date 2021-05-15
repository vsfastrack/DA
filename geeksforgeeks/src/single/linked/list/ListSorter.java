package single.linked.list;

import single.linked.list.utils.ListUtils;

public class ListSorter {
    public static void main(String[] args){
        SingleLinkedList<Node> listOne = ListUtils.readList();
        System.out.println("List before operation is as follows");
        listOne.print();
        Node sortedListPtr = listOne.mergeSort(listOne.getHeaderNode());
        System.out.println("List after operation is as follows");
        listOne.print(sortedListPtr);
    }
}
