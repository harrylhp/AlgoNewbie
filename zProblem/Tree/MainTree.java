package zProblem.Tree;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class MainTree {
    public static void main(String []args){
        // Tree
        //            25
        //       20          27
        //    15   22     26     30
        //  13       23        29   32
        TreeNode root = new TreeNode (25);
        root.left = new TreeNode(20);
        root.right = new TreeNode(27);

        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(22);
        root.right.left = new TreeNode(26);
        root.right.right = new TreeNode(30);

        root.left.left.left = new TreeNode(13);
        root.left.right.right = new TreeNode(23);
        root.right.right.left = new TreeNode(29);
        root.right.right.right = new TreeNode(32);

        System.out.print("Pre-Order Tree :");
        preOrder(root);
        System.out.println();
        System.out.print("In-Order Tree ");
        inOrder(root);
        System.out.println();
        System.out.print("Post-Order Tree ");
        postOrder(root);

        //BFS
        System.out.println();
        System.out.print("Level-Order Tree ");
        levelOrder(root);
    }

    //BFS
    public static void levelOrder(TreeNode root){
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.add(2);
        for (int i =0 ; i < stack.size(); i++)
            System.out.println("The element is : " + stack.get(i));

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(8);
        queue.add(1);
        queue.add(2);
        for (int i = 0 ; i<queue.size(); i++)
            System.out.println("Element in queue : " + queue.remove());


    }

    //Root-Left-Right
    public static void preOrder (TreeNode root){
        System.out.print(root.val + " ");
        if (root.left != null)
            preOrder(root.left);

        if (root.right !=null)
            preOrder(root.right);
    }

    public static void preOrderIterativeWay(TreeNode root){

    }

    //Left-Root-Right
    public static void inOrder (TreeNode root){
        if(root.left !=null)
            inOrder(root.left);

        System.out.print(root.val + " ");

        if(root.right != null)
            inOrder(root.right);
    }

    //Left-Right-Root
    public static void postOrder(TreeNode root){
        if(root.left !=null)
            postOrder(root.left);

        if(root.right != null)
            postOrder(root.right);

        System.out.print(root.val + " ");
    }
}

