package single.linked.list;

import java.util.HashMap;
import java.util.LinkedList;
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
    public void print(Node header){
        Node ptr = header;
        while(ptr != null){
            System.out.print(ptr.getData() +" -> ");
            ptr = ptr.getNext();
            if(ptr == null)
                System.out.print("-||");
        }
        System.out.println();
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
    private void printReverseUsingRecursion(Node ptr){
        if(ptr == null)
            return;
        printReverseUsingRecursion(ptr.getNext());
        System.out.print(ptr.getData() + " ");
    }
    public void printReverse(){
        printReverseUsingRecursion(this.headerNode);
    }
    public void swapPairwiseElements(){
        Node ptr = this.headerNode;
        while(ptr != null && ptr.getNext() != null){
            int data = ptr.getData();
            ptr.setData(ptr.getNext().getData());
            ptr.getNext().setData(data);
            ptr = ptr.getNext().getNext();
        }
    }
    public void moveLastToFront(){
        Node ptr = this.headerNode;
        Node prev = null;
        while(ptr.getNext() != null){
            prev = ptr;
            ptr = ptr.getNext();
        }
        if(prev != null){
            prev.setNext(null);
            ptr.setNext(this.headerNode);
            this.headerNode = ptr;
        }
    }
    public SingleLinkedList<Node> intersectionOfLists(SingleLinkedList<Node> tempList){
        Node ptr1 = this.headerNode;
        Node ptr2 = tempList.headerNode;;
        SingleLinkedList<Node> listIntersection = new SingleLinkedList<>();
        while(ptr1 != null && ptr2 != null){
            if(ptr1.getData() < ptr2.getData()){
                while(ptr1 != null && ptr1.getData() < ptr2.getData())
                    ptr1 = ptr1.getNext();
                if(ptr1 != null && ptr1.getData() == ptr2.getData())
                    listIntersection.add(ptr1.getData());
                ptr2 = ptr2.getNext();
            }else{
                while(ptr2 != null && ptr2.getData() < ptr1.getData())
                    ptr2 = ptr2.getNext();
                if(ptr2 != null && ptr2.getData() == ptr1.getData())
                    listIntersection.add(ptr2.getData());
                ptr1 = ptr1.getNext();
            }
        }
        return listIntersection;
    }

    public void deleteAlternateNodes(){
        Node ptr = this.headerNode;
        while(ptr != null && ptr.getNext() != null){
            Node targetNode = ptr.getNext().getNext();
            ptr.setNext(targetNode);
            ptr = ptr.getNext();
        }
    }

    public Node sortedMerge(SingleLinkedList<Node> targetList){
        Node ptr1 = this.headerNode;
        Node ptr2 = targetList.headerNode;
        Node resultNode;
        if(ptr1 == null)
            return ptr2;
        if(ptr2 == null)
            return ptr1;
        resultNode = (ptr1.getData() <= ptr2.getData()) ? ptr1 : ptr2;
        while(ptr1 != null && ptr2 != null){
            if(ptr1.getData() <= ptr2.getData()){
                while(ptr1.getNext() != null && ptr1.getNext().getData() <= ptr2.getData())
                    ptr1 = ptr1.getNext();
                Node temp = ptr1.getNext();
                ptr1.setNext(ptr2);
                ptr1 = temp;
            }else{
                while(ptr2.getNext() != null && ptr2.getNext().getData() <= ptr1.getData())
                    ptr2 = ptr2.getNext();
                Node temp = ptr2.getNext();
                ptr2.setNext(ptr1);
                ptr2 = temp;
            }
        }
        return resultNode;
    }

    public void alternateEvensAndOddsReArrangement(){
        Node ptr = this.headerNode , ptr1 = null, ptr2 = null;
        int index = 1;
        while(ptr != null){
            if(index % 2 != 0 && ptr.getData() % 2 == 0){
                ptr1 = ptr;
            } else if(index % 2 == 0 && ptr.getData() % 2 != 0){
                ptr2 = ptr;
            }
            if(ptr1 != null && ptr2 != null){
                int temp = ptr1.getData();
                ptr1.setData(ptr2.getData());
                ptr2.setData(temp);
                ptr1 = null;
                ptr2 = null;
            }
            index++;
            ptr = ptr.getNext();
        }
    }

    public Node [] alternateSplit(){
        Node ptr1 = this.headerNode;
        if(ptr1 == null)
            return null;
        Node ptr2 = ptr1.getNext();
        Node a = this.headerNode , b = this.headerNode.getNext();
        while(ptr1 != null && ptr2 != null){
            Node temp = ptr2.getNext();
            ptr1.setNext(temp);
            if(temp != null)
                ptr2.setNext(temp.getNext());
            ptr1 = ptr1.getNext();
            ptr2 = ptr2.getNext();
        }
        return new Node[]{a , b};
    }
    public boolean areListsIdentical(SingleLinkedList<Node> targetList){
        Node ptr = this.headerNode;
        Node ptr1 = targetList.headerNode;;
        while(ptr != null && ptr1 != null && ptr.getData() == ptr1.getData()){
            ptr = ptr.getNext();
            ptr1 = ptr1.getNext();
        }
        return (ptr == null && ptr1 == null);
    }

    public void seggreagateEvenAndOddNodes(){
        Node ptr = this.headerNode  , evenEnd = null;
        Node prev = this.headerNode;
        while(ptr != null){
            if(ptr.getData() % 2 == 0){
                //Connect previous to next node in link
                Node ptrNext = ptr.getNext();
                prev.setNext(ptrNext);

                //Fitting the even node at start of add nodes
                if(evenEnd == null){
                    Node temp = this.headerNode;
                    this.headerNode = ptr;
                    ptr.setNext(temp);
                }else{
                    Node temp = evenEnd.getNext();
                    evenEnd.setNext(ptr);
                    ptr.setNext(temp);
                }
                evenEnd = ptr;
                ptr = ptrNext;
            }else{
                prev = ptr;
                ptr = ptr.getNext();
            }
        }
    }
    public SingleLinkedList<Node> addTwoNumbers(SingleLinkedList<Node> secondNumber){
        Node ptr1= this.headerNode;
        Node ptr2 = secondNumber.headerNode;
        SingleLinkedList<Node> resultList = new SingleLinkedList<>();
        int sum  = 0 , carry = 0 , addition;
        while(ptr1 != null || ptr2 != null){
            int firstData = (ptr1 != null) ? ptr1.getData() : 0 ;
            int secondData = (ptr2 != null) ? ptr2.getData() : 0 ;
            addition = firstData +secondData + carry;
            sum = addition % 10;
            carry = addition / 10;
            resultList.add(sum);
            ptr1 = (ptr1 != null) ? ptr1.getNext() : ptr1;
            ptr2 = (ptr2 != null) ? ptr2.getNext() : ptr2;
        }
        if(carry == 1)
            resultList.add(1);
        return resultList;
    }
    public SingleLinkedList<Node> [] unionAndIntersection(SingleLinkedList<Node> secondList){
        Node ptr1 =  this.headerNode;
        Node ptr2 = secondList.headerNode;
        Map<Integer , Integer> frequencyMap = new HashMap<>();
        SingleLinkedList<Node> [] resultant = new SingleLinkedList[2];
        SingleLinkedList<Node> unionList = new SingleLinkedList<>();
        SingleLinkedList<Node> intersectionList = new SingleLinkedList<>();
        while(ptr1 != null){
            int element = ptr1.getData();
            frequencyMap.put(element , 1);
            unionList.add(element);
            ptr1 = ptr1.getNext();
        }
        while(ptr2 != null){
            int element = ptr2.getData();
            if(frequencyMap.get(element) != null){
                intersectionList.add(element);
            }else{
                frequencyMap.put(element , 1);
                unionList.add(element);
            }
            ptr2 = ptr2.getNext();
        }
        resultant[0] = unionList;
        resultant[1] = intersectionList;
        return resultant;
    }
    public void rotate(int k){
        Node ptr = this.headerNode;
        while(ptr != null && k-- > 1)
            ptr = ptr.getNext();
        if(ptr != null){
            Node nextPtr = ptr.getNext();
            ptr.setNext(null);
            Node currentHeader = this.headerNode;
            this.headerNode = nextPtr;
            Node temp = nextPtr;
            while(temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(currentHeader);
        }
    }
    public SingleLinkedList<Node> addNumbers(SingleLinkedList<Node> secondList){
        this.reverse();
        secondList.reverse();
        Node ptr1 = this.headerNode;
        Node ptr2 = secondList.headerNode;
        SingleLinkedList<Node> result = new SingleLinkedList<>();
        int sum = 0 , carry = 0 , addition = 0;
        while(ptr1 != null || ptr2 != null){
            int firstNumber = (ptr1 != null) ? ptr1.getData() : 0;
            int secondNumber = (ptr2 != null) ? ptr2.getData() : 0;

            addition = firstNumber + secondNumber + carry;
            sum = addition % 10;
            carry = addition / 10;
            result.add(sum);

            ptr1 = (ptr1 != null) ? ptr1.getNext() : ptr1;
            ptr2 = (ptr2 != null) ? ptr2.getNext() : ptr2;
        }
        if(carry == 1)
            result.add(1);
        result.reverse();
        return result;
    }
    public void sort(){
        Node ptr = this.headerNode;
        int zeroCount = 0 , oneCount  = 0 , twoCount  = 0;
        while(ptr != null){
            int element = ptr.getData();
            if(element == 0)
                zeroCount++;
            if(element ==1)
                oneCount++;
            if(element ==2)
                twoCount++;
            ptr = ptr.getNext();
        }
        ptr = this.headerNode;
        while(zeroCount-- > 0){
            ptr.setData(0);
            ptr = ptr.getNext();
        }
        while(oneCount-- > 0){
            ptr.setData(1);
            ptr = ptr.getNext();
        }
        while(twoCount-- > 0){
            ptr.setData(2);
            ptr = ptr.getNext();
        }
    }

}
