package doublcelinkedlist;

public class DoubleLinkedList {
    DLLNode headerNode;
    public void add(int item){
        if(this.headerNode == null){
            this.headerNode = new DLLNode(item);
        }else{
            DLLNode ptr = this.headerNode;
            while(ptr.getNext() != null)
                ptr = ptr.getNext();
            ptr.next = new DLLNode(item , ptr , null);
        }
    }

    public void print(){
        DLLNode ptr = this.headerNode;
        while(ptr != null){
            System.out.print(" <- "+ptr.getData() + " -> ");
            ptr = ptr.getNext();
        }
        System.out.println();
    }

    public void delete(int item){
        if(this.headerNode == null)
            return;
        DLLNode prev = null , ptr = this.headerNode;
        while(ptr != null && ptr.getData() == item){
            prev = ptr;
            ptr = ptr.getNext();
        }
        if(ptr == null)
            return;
        if(prev == null){
            this.headerNode = this.headerNode.getNext();
            return;
        }
        prev.setNext(ptr.getNext());
        ptr.setPrev(prev);
    }

    public void reverse(){
        if(this.headerNode == null)
            return;
        DLLNode ptr = this.headerNode ,prevPtr = null;
        while(ptr != null){
            DLLNode nextPtr = ptr.getNext();
            ptr.setNext(prevPtr);
            if(prevPtr != null)
                prevPtr.setPrev(ptr);
            prevPtr = ptr;
            ptr = nextPtr;
        }
        prevPtr.setPrev(null);
        this.headerNode =   prevPtr;
    }

    public void swapNodes(int k){
        DLLNode ptr = this.headerNode , kFromStart = null , kFromEnd = null;
        if(this.headerNode == null)
            return;
        int index = 1;
        while(ptr.getNext() != null){
            if(index == k){
                kFromStart = ptr;
            }
            ptr = ptr.getNext();
            index++;
        }
        index = 1;
        while(ptr.getPrev() != null){
            if(index == k){
                kFromEnd = ptr;
            }
            ptr = ptr.getPrev();
            index++;
        }
        if(kFromStart != null && kFromEnd != null){
            int temp = kFromStart.getData();
            kFromStart.setData(kFromEnd.getData());
            kFromEnd.setData(temp);
        }
    }
}
