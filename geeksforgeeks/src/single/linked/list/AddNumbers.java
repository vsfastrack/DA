package single.linked.list;

import single.linked.list.utils.ListUtils;

public class AddNumbers {
    public static void main(String[] args){
        SingleLinkedList<Node> listOne = ListUtils.readList();
        SingleLinkedList<Node> listTwo = ListUtils.readList();
        SingleLinkedList<Node> result = listOne.addNumbers(listTwo);
        System.out.println("The sum ");
        result.print();
    }
}
