class Node {
    int data; // value contained inside a node
    Node left, right; // left & right children of a node

    // constructor to set the data of a node to the passed value and make it a leaf
    // node
    Node(int value) {
        data = value;
        left = right = null;
    }
}

// class representing a binary tree
class Tree {
    Node root; // root node of the binary tree

    // constructor to create an empty tree with no root node
    Tree() {
        root = null;
    }

    int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight > rightHeight)
            return leftHeight + 1;
        else
            return rightHeight + 1;
    }

    // Method to traverse the elements of a tree using BFS (level-order traversal)
    // in recursive way
    void levelOrderOrBFS() {
        int h = height(root);
        for (int i = 1; i <= h; i++)
            printNodesAtLevel(root, i, 1);
    }

    // Method to print nodes at the given level
    void printNodesAtLevel(Node root, int level, int currentLevel) {
        if (root == null)
            return;
        if (level == currentLevel)
            System.out.print(root.data + " ");
        else {
            printNodesAtLevel(root.left, level, currentLevel + 1);
            printNodesAtLevel(root.right, level, currentLevel + 1);
        }
    }
}

// driver class to create tree and test code
public class BSF {

    public static void main(String[] args) {
        Tree tree = new Tree(); // constructing an empty tree

        tree.root = new Node(1); // adding the root node

        tree.root.left = new Node(2); // adding left child of root node
        tree.root.right = new Node(3); // adding right child of root node

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.levelOrderOrBFS();
        ;
        System.out.println();

    }
}