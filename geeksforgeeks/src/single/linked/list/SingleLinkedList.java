package single.linked.list;
public class SingleLinkedList<T extends Node> {
    private Node headerNode;
    SingleLinkedList(){

    }
    SingleLinkedList(Node headNode){
        this.headerNode = headNode;
    }
    public void add(int data){
        if(this.headerNode == null){
            this.headerNode = new Node(data);
        }else{
            Node temp = headerNode;
            while(temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(new Node(data));
        }
    }
    public int getLength(){
        int length  = 0;
        Node temp = this.headerNode;
        while(temp != null){
            length++;
            temp = temp.getNext();
        }
        return length;
    }
    public Node detectLoop(){
        boolean hasLoop = false;
        Node slowNode = this.headerNode , fastNode = this.headerNode.getNext();
        while(slowNode != null && fastNode != null && fastNode.getNext() != null){
            slowNode = slowNode.getNext();
            fastNode = fastNode.getNext().getNext();
            if(slowNode == fastNode){
                hasLoop = true;
                break;
            }
        }
        if(!hasLoop)
            return null;
        //Since loop is presnt count the count of elements inside cycle
        Node tempNode = slowNode.getNext();
        int countOfElements  = 1; // Already count starting node of loop
        while(tempNode != slowNode){
            countOfElements++;
            tempNode = tempNode.getNext();
        }
        Node tempNodeOne = this.headerNode , tempNodeTwo = this.headerNode;
        int i = 0;
        //Move to the kth node from beginning
        while(i < countOfElements){
            i++;
            tempNodeTwo = tempNodeTwo.getNext();
        }
        //Start moving slowly to find the loop's firt node
        while(tempNodeOne != tempNodeTwo){
            tempNodeOne = tempNodeOne.getNext();
            tempNodeTwo = tempNodeTwo.getNext();
        }
        while(tempNodeOne.getNext() != tempNodeOne){
            tempNodeOne = tempNodeOne.getNext();
        }
        return tempNodeOne;
    }
    public void detectAndRemoveLoop(){
        Node loopNode = detectLoop();
        if(loopNode != null)
            loopNode.setNext(null);
    }
    public void createLoopInLinkedList(int loopPoint){
        if(this.headerNode != null){
            Node tempNode = this.headerNode , targetNode = null;
            while(tempNode != null && tempNode.getNext() != null){
                if(tempNode.getData() == loopPoint)
                    targetNode = tempNode;
                tempNode = tempNode.getNext();
            }
            if(targetNode != null)
                tempNode.setNext(targetNode);
        }
    }
}
