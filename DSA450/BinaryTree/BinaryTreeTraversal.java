package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int nodeData) {
            data = nodeData;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildNode(int[] nodes) {
            index++;
            //if its a leaf node then exit loop
            if (nodes[index] == -1)
                return null;

            Node node = new Node(nodes[index]);
            node.left = buildNode(nodes);
            node.right = buildNode(nodes);
            return node;
        }
    }

    //Traverse the tree in pre order, i.e, root-->left-->right
    public static void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Traverse the tree in In-order format i.e, left-->root-->right
    public static void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Traverse the tree in post order i.e, left--> right--> root
    public static void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data);
    }

    /* Create an empty queue q and push root in q.
     Run While loop until q is not empty.
     Initialize temp_node = q.front() and print temp_node->data.
     Push temp_node’s children i.e. temp_node -> left then temp_node -> right to q
     Pop front node from q.*/
    public static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode == null) {
                System.out.println();
                if (queue.isEmpty())
                    return;
                else
                    queue.add(null);
            } else {
                System.out.print(currentNode.data + "");
                if (currentNode.left != null)
                    queue.add(currentNode.left);
                if (currentNode.right != null)
                    queue.add(currentNode.right);
            }
        }
    }

    public static int countOfNodes(Node node) {
        if (node == null)
            return 0;

        int left = countOfNodes(node.left);
        int right = countOfNodes(node.right);

        return left + right + 1;
    }

    public static int sumOfNodes(Node node) {
        if (node == null)
            return 0;

        int leftSum = sumOfNodes(node.left);
        int rightSum = sumOfNodes(node.right);

        return leftSum + rightSum + node.data;
    }

    public static int height(Node node) {
        if (node == null)
            return 0;

        int leftSubTree = height(node.left);
        int rightSubTree = height(node.right);

        int highest = Math.max(leftSubTree, rightSubTree);
        return highest + 1;
    }

    //diameter for tree passing through root with O(n^2)
    public static int diameter1Approach1(Node root) {
        if (root == null)
            return 0;

        int step1 = diameter1Approach1(root.left);
        int step2 = diameter1Approach1(root.right);
        int step3 = height(root.left) + height(root.right) + 1;

        return Math.max(step1, Math.max(step2, step3));
    }

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    //diameter for tree passing through root, with O(n)
    public static TreeInfo diameter1Approach2(Node root) {

        if(root == null)
            return new TreeInfo(0,0);

        TreeInfo leftNode = diameter1Approach2(root.left);
        TreeInfo rightNode = diameter1Approach2(root.right);

        int height = Math.max(leftNode.height, rightNode.height) + 1;

        int step1 = leftNode.diameter;
        int step2 = rightNode.diameter;
        int step3 = leftNode.height + rightNode.height + 1;

        int diameter = Math.max(step1, Math.max(step2,step3));

        return new TreeInfo(height,diameter);
    }

    public static void main(String args[]) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node rootNode = BinaryTree.buildNode(nodes);
       /* preOrder(rootNode);
        inOrder(rootNode);
        postOrder(rootNode);
        levelOrder(rootNode);
        System.out.println("count of nodes: " + countOfNodes(rootNode));
        System.out.println("Sum of nodes: " + sumOfNodes(rootNode));
        System.out.println("Height of the tree : "+ height(rootNode));
        System.out.println(diameter1Approach1(rootNode));
        */

        System.out.println(diameter1Approach2(rootNode).diameter);
    }
}
