package LinkedList;

public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;
    public Node(T data){
        this.data = data;
        next = null;
        prev = null;
    }
    @Override
    public String toString() {
        return data.toString();
    }
}
