package single.linked.list;

import java.util.HashMap;
import java.util.Map;

public class SingleLinkedList<T extends Node> {
    private Node headerNode;
    public SingleLinkedList(){

    }
    public SingleLinkedList(Node headNode){
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
    public int getLength(Node headerNode){
        if(headerNode == null)
            return 0;
        return 1 + getLength(headerNode.getNext());
    }
    public int getLengthRecursively(){
        return getLength(this.headerNode);
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
        //Start moving slowly to find the loop's first node
        while(tempNodeOne != tempNodeTwo){
            tempNodeOne = tempNodeOne.getNext();
            tempNodeTwo = tempNodeTwo.getNext();
        }
        while(tempNodeTwo.getNext() != tempNodeOne){
            tempNodeTwo = tempNodeTwo.getNext();
        }
        return tempNodeTwo;
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
            if(targetNode != null) {
                tempNode.setNext(targetNode);
            }
        }
    }

    public void delete(int key) {
        Node previousNode = this.headerNode;
        if (previousNode.getData() == key) {
            this.headerNode = null;
        }
        Node currentNode = this.headerNode.getNext();
        while (currentNode != null) {
            if (currentNode.getData() == key) {
                previousNode.setNext(currentNode.getNext());
                currentNode = null;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }
    public void print(){
        Node tempNode= this.headerNode;
        while(tempNode != null){
            System.out.print(tempNode.getData() + " , ");
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }
    public boolean searchElement(Node node , int key){
        if(node == null)
            return false;
        if(node.getData() == key)
            return true;
        return searchElement(node.getNext(), key);
    }
    public boolean searchElementRecursively(int key){
        return searchElement(this.headerNode , key);
    }
    public Node findNthNode( int n){
        int count = 1;
        Node currNode = this.headerNode;
        while(currNode != null && count < n){
            currNode = currNode.getNext();
            count++;
        }
        return currNode;
    }

    public Node findNthNodeFromEnd(int n){
        Node currNode = this.headerNode;
        int indexOfNode = 1;
        int length = this.getLengthRecursively();
        if(n > length || n < 1)
            return null;
        while(currNode != null && indexOfNode < length - n + 1){
            currNode = currNode.getNext();
            indexOfNode++;
        }
        return currNode;
    }
    public Node [] findMiddleOfLinkedList(){
        Node currNode = this.headerNode;
        int length = this.getLengthRecursively();
        if(length == 0)
            return null;
        int indexOfNode = 1;
        while(currNode != null && indexOfNode < (length/2)){
            currNode = currNode.getNext();
            indexOfNode++ ;
        }
        Node [] midNodes;
        if(length % 2 == 0)
            midNodes = new Node [] {currNode , currNode.getNext()};
        else
            midNodes = new Node [] {currNode.getNext()};
        return midNodes;
    }
    public int findFrequencyOfElements(int k){
        int frequency = 0;
        Node currNode = this.headerNode;
        while(currNode != null){
            if(currNode.getData() == k)
                frequency++;
            currNode = currNode.getNext();
        }
        return frequency;
    }
    public SingleLinkedList<Node> copyOf(){
        Node currNode = this.headerNode;
        SingleLinkedList<Node> copyList = new SingleLinkedList<>();
        while(currNode != null){
            copyList.add(currNode.getData());
            currNode = currNode.getNext();
        }
        return copyList;
    }
    public void reverse(){
        Node prevNode = this.headerNode;
        if(prevNode.getNext() == null)
            return;
        Node currentNode = prevNode.getNext();
        while(currentNode != null){
            Node nextNode = currentNode.getNext();
            currentNode.setNext(prevNode);
            prevNode = currentNode;
            currentNode = nextNode;
        }
        Node firstNode = this.headerNode;
        this.headerNode = prevNode;
        firstNode.setNext(null);
    }
    public boolean isPalindrome(){
        SingleLinkedList<Node> copyList = this.copyOf();
        copyList.reverse();
        Node currNode = this.headerNode;
        Node copyCurrNode = copyList.headerNode;
        while(currNode != null && currNode.getData() == copyCurrNode.getData()){
            currNode = currNode.getNext();
            copyCurrNode = copyCurrNode.getNext();
        }
        return currNode == null;
    }
    public void removeDuplicates(){
        Node prevNode = this.headerNode;
        while(prevNode != null && prevNode.getNext() != null){
            Node currNode = prevNode.getNext();
            while(prevNode.getData() == currNode.getData()){
                currNode = currNode.getNext();
            }
            prevNode.setNext(currNode);
            prevNode = prevNode.getNext();
        }
    }
    public void removeDuplicatesFromUnsorted(){
        Map<Integer , Integer> visited = new HashMap<>();
        Node currNode = this.headerNode , prevNode = null;
        while(currNode != null){
            int data = currNode.getData();
            if(visited.get(data) == null){
                visited.put(data , 1);
                prevNode = currNode;
                currNode = currNode.getNext();
            }
            else{
                prevNode.setNext(currNode.getNext());
                currNode = currNode.getNext();
            }

        }
    }
    public void swap(int keyOne , int keyTwo){
        Node currNode = this.headerNode;
        Node prevNode = null , firstNode = null , secondNode = null , prevFirstNode = null , prevSecondNode = null;
        while(currNode != null){
            if(currNode.getData() == keyOne){
                prevFirstNode = prevNode;
                firstNode = currNode;
            }
            if(currNode.getData() == keyTwo){
                prevSecondNode = prevNode;
                secondNode = currNode;
                break;
            }
            prevNode = currNode;
            currNode = currNode.getNext();
        }
        if(firstNode != null && secondNode != null){
            Node tempNode = secondNode.getNext();
            prevFirstNode.setNext(secondNode);
            secondNode.setNext(firstNode.getNext());
            prevSecondNode.setNext(firstNode);
            firstNode.setNext(tempNode);
        }
    }
    public void merge(SingleLinkedList<Node> listTwo){
        Node ptr1 = this.headerNode;
        Node ptr2 = listTwo.headerNode;
        while(ptr1 != null && ptr2 != null){
            int ptrOneData = ptr1.getData();
            int ptrTwoData = ptr2.getData();
            if(ptrOneData < ptrTwoData){
                Node prevNode = ptr1;
                while(ptr1 != null && ptr1.getData() < ptrTwoData){
                    prevNode = ptr1;
                    ptr1 = ptr1.getNext();
                }
                prevNode.setNext(ptr2);
            }else{
                Node prevNode = ptr2;
                while(ptr2 != null && ptr2.getData() < ptrOneData){
                    prevNode = ptr2;
                    ptr2 = ptr2.getNext();
                }
                prevNode.setNext(ptr1);
            }
        }
    }
    public void intersect(SingleLinkedList<Node> tempList ,  int positionOne  ,int positionTwo){
        Node currentNode =  this.headerNode , ptr = tempList.headerNode;
        int indexCount = 1;
        while(currentNode != null && indexCount < positionOne){
            currentNode = currentNode.getNext();
            indexCount++;
        }
        indexCount = 1;
        while(ptr != null && indexCount < positionTwo){
            ptr = ptr.getNext();
            indexCount++;
        }
        ptr.setNext(currentNode);
    }
    public Node findIntersection(SingleLinkedList<Node> placeHolderList){
        int currListLength = this.getLength();
        int placeHolderListLength = placeHolderList.getLength();
        int absoluteDiff = Math.abs(currListLength - placeHolderListLength);
        int indexOfCount = 1;
        Node ptr1 , ptr2;
        if(placeHolderListLength > currListLength){
            ptr1 = this.headerNode;
            ptr2 = placeHolderList.headerNode;
        } else{
            ptr2 = this.headerNode;
            ptr1 = placeHolderList.headerNode;
        }
        while(ptr1 != null && indexOfCount < absoluteDiff){
            ptr1 = ptr1.getNext();
            indexOfCount++;
        }
        while(ptr1 != null && ptr2 != null && ptr1 != ptr2){
            ptr1 = ptr1.getNext();
            ptr2 = ptr2.getNext();
        }
        if(ptr1 != null)
            return ptr1;
        return null;
    }
}
