package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    private int data;

    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value){
        // No duplicate value
        if (data == value)
            return;

        if (data > value)
            if (leftChild == null)
                leftChild = new TreeNode(value);
            else
                leftChild.insert(value);

        if (data < value)
            if (rightChild == null)
                rightChild = new TreeNode(value);
            else
                rightChild.insert(value);
    }

    // DFS - Recursive Way
    // PreOrder (Root, Left, Right)
    // InOrder (Left, Root, Right) , it will make the binary tree in ascending order
    // PostOrder (Left, Right, Root)
    public void traversePreOrder(){
        System.out.print(data + ", ");

        if (leftChild!=null)
            leftChild.traversePreOrder();

        if (rightChild!=null)
            rightChild.traversePreOrder();

    }

    public void traverseInOrder(){
        if (leftChild!=null)
            leftChild.traverseInOrder();

        System.out.print(data + ", ");
        if (rightChild!=null)
            rightChild.traverseInOrder();
    }

    public void traversePostOrder(){
        if (leftChild!=null)
            leftChild.traversePostOrder();

        if (rightChild!=null)
            rightChild.traversePostOrder();

        System.out.print(data + ", ");

    }

    // DFS - Iteratively Way
    // PreOrder - Easy with Stack
    // InOrder -
    // PostOrder -
    public void traversePreOrderIterative(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode removedNode = stack.pop();
            System.out.print(removedNode.data + ", ");

            // As last in first out, to print root -> left -> right. We push the right->left
            if (removedNode.rightChild !=null) {
                stack.push(removedNode.rightChild);
            }

            if (removedNode.leftChild !=null) {
                stack.push(removedNode.leftChild);
            }
        }
    }

    public void traverseInOrderIterative(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode current = root;
        stack.push(root);
        while (!stack.isEmpty()){
            while (current.leftChild!=null){
                stack.push(current.leftChild);
                current = current.leftChild;
            }
            current = stack.pop();
            System.out.print(current.data + ", ");

            if(current.rightChild!=null) {
                stack.push(current.rightChild);
                current = current.rightChild;
            }
        }
    }

    // PostOrder 1 stack => hard to understand
    public void traversePostOrderIterativeOneStack(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        boolean isLeaf;
        TreeNode lastPrintedNode = root;

        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            isLeaf = current.leftChild == null && current.rightChild == null;
            // Logic
            // We only print the node starting from leftChild as long as it's a leaf node
            // Then we proceed to print the rightChild
            // The tricky part is the parent node, when we need to print it, as long as it has the left or right child as previous printed node =>print it
            if (isLeaf || lastPrintedNode == current.rightChild || lastPrintedNode == current.leftChild) {
                System.out.print(current.data + ", ");
                lastPrintedNode = current;
            } else {
                stack.push(current);
                if (current.rightChild != null) {
                    stack.push(current.rightChild);
                }
                if (current.leftChild != null) {
                    stack.push(current.leftChild);
                }
            }

        }
    }

    // PostOrder 2 stacks => easier to understand
    public void traversePostOrderIterativeTwoStack(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);

        LinkedList<TreeNode> output = new LinkedList<TreeNode>();
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            output.push(current);

            if (current.leftChild!=null)
                stack.push(current.leftChild);

            if (current.rightChild!=null)
                stack.push(current.rightChild);
        }

        while(!output.isEmpty())
            System.out.print(output.pop().data + ", ");

    }

    public TreeNode getValue(int value){
        if (data == value)
            return this;

        if (data > value){
            if (leftChild!=null)
                return leftChild.getValue(value);
        }
        else
            if (rightChild!=null)
                return rightChild.getValue(value);

        return null;
    }

    public int max(){
        if (rightChild == null)
            return data;
        else
            return rightChild.max();
    }

    public int min(){
        if (leftChild == null)
            return data;
        else
            return leftChild.min();
    }

    //BFS - Iterative Way (BFS uses always queue)
    //In level tree
    public void printLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode removedNode = queue.poll();
            System.out.print(removedNode.data + ", ");

            if (removedNode.leftChild!=null)
                queue.add(removedNode.leftChild);

            if (removedNode.rightChild!=null)
                queue.add(removedNode.rightChild);
        }
    }

    public int heightRecursive(TreeNode root){
        if (root == null)
            return -1;

        int leftHeight = heightRecursive(root.leftChild);
        int rightHeight = heightRecursive(root.rightChild);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // It's quite similar with the printLevelOrder, just add in the size & height
    public int heightIterative(TreeNode root){
        if (root == null)
            return -1;

        int height = -1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int size = -1;

        while (!queue.isEmpty()){
            size = queue.size();

            height++;
            while(size > 0){
                TreeNode node = queue.remove();
                if (node.leftChild !=null)
                    queue.add(node.leftChild);

                if (node.rightChild !=null)
                    queue.add(node.rightChild);

                size--;
            }
        }

        return height;
    }

    public TreeNode (int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) { this.data = data; }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }
}
