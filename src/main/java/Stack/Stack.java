package Stack;

public class Stack<T> {

    private T[] items = (T[]) new Object[4];

    int top;
    int size;
    public Stack(){
        size = items.length;
        top = -1;
    }
    public void push(T item){

        if(top < size)
            items[++top] = item;
        else
            System.out.println("Stack is full");
    }

    public void printValues(){

        for(int i=0; i<size; i++){
            System.out.print(items[i]);
        }
        System.out.println();
    }

    public Object pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        } else {
            return items[top--];
        }
    }
    public T peek(){
        return items[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size-1;
    }
    public int size(){
        return top+1;
    }
}
