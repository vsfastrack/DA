package single.linked.list;

public class TypeNode<T> {
    T data;
    TypeNode<T> next;

    TypeNode(){

    }
    TypeNode(T data){
        this.data = data;
        this.next = null;
    }

    TypeNode(T item , TypeNode<T> next){
        this.data = item;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TypeNode<T> getNext() {
        return next;
    }

    public void setNext(TypeNode<T> next) {
        this.next = next;
    }

}
