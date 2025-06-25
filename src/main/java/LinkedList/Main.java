package LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(2);
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.addFirst(5);
        nums.addLast(6);

        System.out.println(nums.peek() + "\t" + nums + "\n" + nums.size());

        nums.removeFirst();
        nums.removeLast();
        System.out.println(nums.peek() + "\t" + nums + "\n" + nums.size());
        nums.remove(1);
        System.out.println(nums.peek() + "\t" + nums + "\n" + nums.size());

        nums.clear();
        System.out.println(nums.size());
        nums.printValues();
    }
}
