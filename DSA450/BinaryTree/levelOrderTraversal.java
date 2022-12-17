package BinaryTree;

import java.util.*;

public class levelOrderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int index = -1;
        public static Node buildNode(int[] nodes){
            index++;

            if(nodes[index] == -1)
                return null;

            Node node = new Node(nodes[index]);
            node.left  = buildNode(nodes);
            node.right = buildNode(nodes);

            return node;
        }
    }

    //print tree data - preOrder
    public static void preOrder(Node node)
    {
        if(node == null)
            return ;

        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    // level order traversal or breath first search - this uses queue ds
    public static Map<Integer,List<Integer>> levelOrder(Node root) {

        if(root == null)
            return null;

        Integer key = 1;
        Map<Integer,List<Integer>> map = new HashMap<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        map.compute(key,(k,v)->v==null?new ArrayList<>():v).add(root.data);
        key++;

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            //add null for better UI
            if (currentNode == null) {
                if (queue.isEmpty()){
                    System.out.println("");
                    return map;
                }
                else{
                    System.out.println("");
                    queue.add(null);
                    key++;
                }
            }

            //add the children
            else {
                System.out.print(currentNode.data);
                Node left = currentNode.left;
                Node right = currentNode.right;
                if (left != null) {
                    queue.add(left);
                    map.compute(key, (k, v) -> v == null ? new ArrayList<>() : v).add(left.data);
                }
                if (right != null) {
                    queue.add(right);
                    map.compute(key, (k, v) -> v == null ? new ArrayList<>() : v).add(right.data);
                }
            }
        }

        return  map;
    }

    public static void main(String args[]){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        int level = 3;
        Node rootNode = BinaryTree.buildNode(nodes);

       // preOrder(rootNode);
        Map<Integer, List<Integer>> levelOrderMap = levelOrder(rootNode);

        levelOrderMap.forEach((k,v)-> {
            if(k==level)
                System.out.println("sum of nodes at level "+level+ " is : "+v.stream().mapToInt(val->val).sum());
        });
    }
}
