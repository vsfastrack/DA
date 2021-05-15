package single.linked.list;

import single.linked.list.utils.ListUtils;

public class DescendingMerge {
    public static void main(String[] args){
        SingleLinkedList listOne = ListUtils.readList();
        SingleLinkedList listTwo = ListUtils.readList();
        System.out.println("List before operation is as follows");
        listOne.print();
        listOne.descendingMergeSort(listTwo);
        System.out.println("List after operation is as follows");
        listOne.print();
    }
}
