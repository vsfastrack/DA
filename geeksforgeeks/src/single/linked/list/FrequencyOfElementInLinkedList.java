package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElementInLinkedList {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        Scanner scanner = new Scanner(System.in);
        int keyElement = scanner.nextInt();
        System.out.println(sll.findFrequencyOfElements(keyElement));
    }
}
