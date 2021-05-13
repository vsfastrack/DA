package single.linked.list;

import single.linked.list.utils.ListUtils;

public class UnionAndIntersection {
    public static void main(String[] args){
        SingleLinkedList<Node> firstList = ListUtils.readList();
        SingleLinkedList<Node> secondList = ListUtils.readList();
        SingleLinkedList<Node> [] result = firstList.unionAndIntersection(secondList);
        System.out.println("Union is as follows");
        result[0].print();
        System.out.println("Intersection is as follows");
        result[1].print();
    }
}
