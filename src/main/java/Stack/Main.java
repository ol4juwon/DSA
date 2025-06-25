package Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
        stack.pop();
        stack.printValues();
        System.out.println(stack.size());
    }
}
