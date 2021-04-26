package single.linked.list;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = new TestRunner().readList();
        sll.createLoopInLinkedList(5);
        sll.detectAndRemoveLoop();
    }
    public SingleLinkedList<Node> readList(){
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
}
