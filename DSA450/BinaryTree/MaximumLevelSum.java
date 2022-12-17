package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

//Definition for a binary tree node.

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaximumLevelSum {
    public static int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int currLevel = 0;
        int maxLevel = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            currLevel++;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                currSum += curr.val;

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                maxLevel = currLevel;
            }
            currSum = 0;
        }
        return maxLevel;
    }

    static class BinaryTree {

        static int index = -1;
        public static TreeNode buildNode(int[] nodes){
            index++;

            if(nodes[index] == -1)
                return null;

            TreeNode node = new TreeNode(nodes[index]);
            node.left  = buildNode(nodes);
            node.right = buildNode(nodes);

            return node;
        }
    }
    public static void main(String args[])
    {
        int[] nodes = {1,7,7,-1,-1,-8,-1,-1,0,-1,-1};
        TreeNode rootNode = BinaryTree.buildNode(nodes);
        System.out.println(maxLevelSum(rootNode));
    }
}

