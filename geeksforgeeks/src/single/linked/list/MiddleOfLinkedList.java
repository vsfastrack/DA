package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Arrays;

public class MiddleOfLinkedList {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        Node [] middleNodes = sll.findMiddleOfLinkedList();
        Arrays.stream(middleNodes).map(Node::getData).forEach(System.out::println);
    }
}
