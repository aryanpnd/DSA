import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

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
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.remove();
            System.out.print(temp.data + " ");

            // enqueue left child into queue
            if (temp.left != null)
                queue.add(temp.left);

            // enqueue right child into queue
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    public int findMax() 
	{ 
		Queue<Node> queue = new LinkedList<Node>(); 
		queue.add(root); 
		int max=Integer.MIN_VALUE;
		while (!queue.isEmpty()) 
		{ 
			Node temp = queue.peek();
			queue.remove();
			if(temp.data>max){
			    max=temp.data;
			} 

			//Enqueue left child
			if (temp.left != null) { 
				queue.add(temp.left); 
			} 

			//Enqueue right child 
			if (temp.right != null) { 
				queue.add(temp.right); 
			} 
		} 
		return max;
	} 

}

// driver class to create tree and test code
public class BsfIterative {

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
        System.out.println();
        System.out.println(tree.findMax());

    }
}