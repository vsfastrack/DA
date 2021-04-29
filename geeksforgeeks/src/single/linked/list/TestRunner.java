package single.linked.list;

import single.linked.list.utils.ListUtils;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args){
        TestRunner obj = new TestRunner();
        //Detect and remove linked list
        //obj.detectAndRemoveLoop();

        //Delete a node in linked List
        //obj.delete();

        //Finding length of linked list
        //obj.findLength();

        //searching element in linked list
        obj.searchElement();

    }
    public void detectAndRemoveLoop(){
        SingleLinkedList<Node> sll = ListUtils.readList();
        sll.createLoopInLinkedList(5);
        sll.detectAndRemoveLoop();
    }
    public void delete(){
        SingleLinkedList<Node> sll = ListUtils.readList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Linked List before deletion");
        sll.print();
        sll.delete(n);
        System.out.println("Linked List after deletion");
        sll.print();
    }
    public void findLength(){
        SingleLinkedList<Node> sll = ListUtils.readList();
        System.out.println("Iterative length "+ sll.getLength());
        System.out.println("Recursive length "+ sll.getLengthRecursively());
    }
    public void searchElement(){
        SingleLinkedList<Node> sll = ListUtils.readList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Eelement found in list : " +sll.searchElementRecursively(n));
    }
}
