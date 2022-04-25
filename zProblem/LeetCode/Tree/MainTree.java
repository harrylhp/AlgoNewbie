package zProblem.LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class MainTree {
    public static void main(String[]args){
        /*
        System.out.println("1st way to initialize Tree");
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(8);
         */

        System.out.println("2nd way to initialize Tree - A bit hard to see");
        TreeNode root = new TreeNode(2,new TreeNode(1),
                new TreeNode(4, new TreeNode(3), new TreeNode(7, new TreeNode(5), new TreeNode(8))));

        // Tree
        //       2
        //     1    4
        //        3   7
        //           5  8

        List<Integer> list = inOrderTraversal(root);
        System.out.print("InOrder Traversal is " + list);

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(8);

        TreeNode root3 = new TreeNode(5);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);

        System.out.println();
        System.out.println("Min is " + min(root));
        System.out.println("Max is " + max(root));

        if(isValidBST(root))
            System.out.println("Valid BST 1");

        if(isValidBST(root2))
            System.out.println("Valid BST 2");

        if(isValidBST(root3))
            System.out.println("Valid BST 3");
    }

    public static boolean isValidBST(TreeNode root){
        return validateLeftRight(root, null, null);
    }

    public static boolean validateLeftRight(TreeNode root, Integer min, Integer max){
        if (root ==null)
            return true;

        if ((min!= null && root.val <= min) || (max!=null && root.val >=max))
            return false;

        return validateLeftRight(root.left, min, root.val) && validateLeftRight(root.right, root.val, max);

    }


    public static int min(TreeNode root){
        if (root == null)
            return Integer.MIN_VALUE;

        if (root.left == null)
            return root.val;
        else
            return min(root.left);
    }

    public static int max(TreeNode root){
        if (root == null)
            return Integer.MAX_VALUE;

        if (root.right == null)
            return root.val;
        else
            return max(root.right);
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public static void helper(TreeNode root, List<Integer> list){
        if (root == null)
            return;

        if (root.left!=null)
            helper(root.left, list);

        list.add(root.val);

        if (root.right !=null)
            helper(root.right, list);
    }
}
