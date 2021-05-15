package single.linked.list.utils;

import circular.linked.list.CircularLinkedList;
import single.linked.list.Node;
import single.linked.list.SingleLinkedList;

import java.util.Scanner;

public class ListUtils {
    public static SingleLinkedList<Node> readList(){
        SingleLinkedList<Node> sll = new SingleLinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;
        while(z < n){
            sll.add(scanner.nextInt());
            z++;
        }
        return sll;
    }
    public static CircularLinkedList<Node> readCircularList(){
        CircularLinkedList<Node> circularLinkedList = new CircularLinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;
        while(z < n){
            circularLinkedList.add(scanner.nextInt());
            z++;
        }
        return circularLinkedList;
    }
}
