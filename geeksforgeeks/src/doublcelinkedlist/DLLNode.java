package doublcelinkedlist;

public class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;
    DLLNode(){}
    DLLNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    DLLNode(int data , DLLNode prev , DLLNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getPrev() {
        return prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }
}
