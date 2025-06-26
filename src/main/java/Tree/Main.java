package Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<String>();
        tree.insert("f");
        tree.insert("c");
        tree.insert("d");
        tree.insert("m");
        tree.insert("v");
        tree.insert("n");
        tree.insert("h");
        tree.insert("i");
        tree.insert("d");
        tree.insert("a");
        tree.insert("s");
        tree.insert("a");
        tree.insert("g");

        tree.printTree();
    }
}
