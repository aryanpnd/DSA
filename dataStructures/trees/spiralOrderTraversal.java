import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }
    
    // Method to construct a binary tree from the given array
	public Node insertNode(int[] elementsArr, Node node, int i) {
		if(i < elementsArr.length){
			node = new Node(elementsArr[i]);
			node.left = insertNode(elementsArr,node.left,2 * i + 1);
			node.right = insertNode(elementsArr,node.right,2 * i + 2);
		}
		return node;
	}

    // Method to calculate height of a tree
    int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = 1 + height(root.left);
        int rightHeight = 1 + height(root.right);

        if (leftHeight > rightHeight)
            return leftHeight;
        else
            return rightHeight;
    }

    // Method to traverse the elements of a tree using BFS (level-order traversal) in the spiral order
    void spiralOrder() {
        int h = height(root);
        boolean ltr = false; // print second level in the left-to-right order
        for (int i = 1; i <= h; i++) {
            printNodesAtLevel(root, i, 1, ltr);
            ltr = !ltr;
        }
    }

    // Method to print nodes at the given level
    void printNodesAtLevel (Node root, int level, int currentLevel, boolean ltr) {
        if (root == null)
            return;
        if (level == currentLevel)
            System.out.print(root.data + " ");
        else {
            if (ltr) {
                printNodesAtLevel(root.left, level, currentLevel + 1, ltr);
                printNodesAtLevel(root.right, level, currentLevel + 1, ltr);
            } else {
                printNodesAtLevel(root.right, level, currentLevel + 1, ltr);
                printNodesAtLevel(root.left, level, currentLevel + 1, ltr);
            }
        }
    }
}

// WARNING: Do not edit the code given below; failing which your solution may not pass the test case(s)
class spiralOrderTraversal {

    public static void main(String[] args) {
        Tree tree = new Tree(); // constructing an empty tree

        tree.root = new Node(1); // adding the root node

        tree.root.left = new Node(2); // adding left child of root node
        tree.root.right = new Node(3); // adding right child of root node

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.spiralOrder();
    }
}

