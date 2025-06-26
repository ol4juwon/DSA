package Tree;

public class BinaryTree<T> {
    Node<T> root;
    public void insert(T data){
        root = insertRecursion(root, data);

    }

    public Node<T> insertRecursion  (Node<T> root, T data){
        if (root == null) {
            root = new Node<T>(data);
        } else if (((Comparable<T>) data).compareTo(root.data) < 0) {
            root.left = insertRecursion(root.left, data);
        } else if (((Comparable<T>) data).compareTo(root.data) > 0) {
            root.right = insertRecursion(root.right, data);
        }
        return root;
    }

    public void printTree() {
        inOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        printGraphically(root);
        System.out.println();
    }

    private void inOrderTraversal(Node<T> node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    private void preOrderTraversal(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    private void postOrderTraversal(Node<T> node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    private void levelOrderTraversal(Node<T> node){
        if(node == null)
            return;
        else{
            System.out.println(node.data);
            levelOrderTraversal(node.left);
            levelOrderTraversal(node.right);
        }
    }

    private void printGraphically(Node<T> node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        }
        int maxLevel = maxDepth(node);
        printNodeInternal(java.util.Collections.singletonList(node), 1, maxLevel);
    }

    private void printNodeInternal(java.util.List<Node<T>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || isAllElementsNull(nodes)) return;

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, Math.max(floor - 1, 0));
        int firstSpaces = (int) Math.pow(2, floor) - 1;
        int betweenSpaces = (int) Math.pow(2, floor + 1) - 1;

        printWhitespaces(firstSpaces);

        java.util.List<Node<T>> newNodes = new java.util.ArrayList<>();
        for (Node<T> node : nodes) {
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                System.out.print(" ");
                newNodes.add(null);
                newNodes.add(null);
            }
            printWhitespaces(betweenSpaces);
        }
        System.out.println();

        for (int i = 1; i <= edgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    printWhitespaces(edgeLines + edgeLines + i + 1);
                    continue;
                }
                if (nodes.get(j).left != null) System.out.print("/");
                else printWhitespaces(1);
                printWhitespaces(i + i - 1);
                if (nodes.get(j).right != null) System.out.print("\\");
                else printWhitespaces(1);
                printWhitespaces(edgeLines + edgeLines - i);
            }
            System.out.println();
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) System.out.print(" ");
    }

    private int maxDepth(Node<T> node) {
        if (node == null) return 0;
        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }

    private boolean isAllElementsNull(java.util.List<Node<T>> list) {
        for (Node<T> node : list) {
            if (node != null) return false;
        }
        return true;
    }
}
