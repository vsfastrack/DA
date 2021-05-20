package circular.linked.list;

import single.linked.list.Node;

public class CircularLinkedList <T extends Node>{
    Node headerNode;
    public CircularLinkedList(){
        this.headerNode = null;
    }
    CircularLinkedList(Node node){
        this.headerNode = node;
    }
    public void add(int item){
        if(this.headerNode == null){
            Node newNode = new Node(item);
            this.headerNode = newNode;
            newNode.setNext(this.headerNode);
        }else{
            Node ptr = this.headerNode;
            while(ptr.getNext() != this.headerNode)
                ptr = ptr.getNext();
            Node newNode = new Node(item);
            ptr.setNext(newNode);
            newNode.setNext(this.headerNode);
        }
    }
    public void print(Node circularHeadNode){
        if(circularHeadNode == null)
            return;
        Node ptr = circularHeadNode;
        while(ptr.getNext() != circularHeadNode){
            System.out.print(ptr.getData() + " -> ");
            ptr = ptr.getNext();
        }
        System.out.println(ptr.getData()+" -> ");
    }
    public void print(){
        Node ptr = this.headerNode;
        if(ptr == null)
            return;
        while(ptr.getNext() != this.headerNode){
            System.out.print(ptr.getData() +" -> ");
            ptr = ptr.getNext();
        }
        System.out.println(ptr.getData()+" -> ");
    }
    public Node [] splitInTwoHalves(){
        Node slowPtr = this.headerNode;
        if(slowPtr == null)
            return new Node[2];
        Node fastPtr = slowPtr.getNext();
        while(fastPtr != this.headerNode && fastPtr.getNext() != this.headerNode){
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        Node nextPtr = slowPtr.getNext();
        slowPtr.setNext(this.headerNode);
        fastPtr.setNext(nextPtr);
        return new Node[]{this.headerNode , nextPtr};
    }
    public void sortedInsert(int item){
        if(this.headerNode == null){
            Node newNode = new Node(item);
            this.headerNode = newNode;
            newNode.setNext(this.headerNode);
        }else{
            Node ptr = this.headerNode , prev = null;
            while(ptr.getNext() != this.headerNode && ptr.getData() < item){
                prev = ptr;
                ptr = ptr.getNext();
            }
            Node newNode = new Node(item);
            if(ptr == this.headerNode && ptr.getData() > item){
                Node temp = this.headerNode;
                this.headerNode = newNode;
                newNode.setNext(temp);
                Node tempPtr = temp;
                while(tempPtr.getNext() != temp)
                    temp = temp.getNext();
                temp.setNext(newNode);
            }else{
                Node nextPtr = ptr.getNext();
                if(nextPtr == this.headerNode){
                    ptr.setNext(newNode);
                    newNode.setNext(nextPtr);
                }else{
                    if(prev != null)
                        prev.setNext(newNode);
                    newNode.setNext(ptr);
                }
            }
        }
    }
}
