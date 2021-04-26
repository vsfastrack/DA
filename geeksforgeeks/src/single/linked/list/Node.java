package single.linked.list;

public class Node {
    int data;
    Node next;

    Node(){

    }

    Node(int item){
        this.data = item;
        this.next = null;
    }

    Node(int item , Node next){
        this.data = item;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

