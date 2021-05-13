package single.linked.list;

import single.linked.list.utils.ListUtils;

public class AddTwoNumbers {
    public static void main(String[] args){
        SingleLinkedList<Node> firstNumber = ListUtils.readList();
        SingleLinkedList<Node> secondNumber = ListUtils.readList();
        SingleLinkedList<Node> sumList = firstNumber.addTwoNumbers(secondNumber);
        System.out.println("Sum of two numbers is as follows");
        sumList.print();
    }
}
