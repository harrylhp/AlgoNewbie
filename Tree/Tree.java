package Tree;

public class Tree {
    private TreeNode root;

    public void insert (int value){
        if (root == null)
            root = new TreeNode(value);
        else
            root.insert (value);
    }

    public void delete (int value){
        delete(root, value);
    }

    public TreeNode delete (TreeNode root, int value){
        // Base Case
        if (root == null)
            return null;

        // Recursion : To traverse to left or right
        if (value < root.getData())
            root.setLeftChild(delete(root.getLeftChild(), value));
        else if (value > root.getData())
            root.setRightChild(delete(root.getRightChild(), value));
        // Found the value the move to this else
        else{
            // Case 0 and 1, there is no child or only 1 child
            // The above recursion will do the Set Left or Right, just return the correct node
            if (root.getLeftChild() == null)
                return root.getRightChild();
            else if (root.getRightChild() == null)
                return root.getLeftChild();

            // Case 2, there are 2 children
            // Choose the smallest value on the right subtree => Get the In Order Successor
            root.setData(root.getRightChild().min());

            // Delete the In Order Successor on the right with the same value just set to the replacement node
            root.setRightChild(delete(root.getRightChild(), root.getData()));

        }
        return root;

    }

    // DFS - Recursion
    public void traversePreOrder(){
        if (root !=null)
            root.traversePreOrder();
    }

    public void traverseInOrder(){
        if (root !=null)
            root.traverseInOrder();
    }

    public void traversePostOrder(){
        if (root !=null)
            root.traversePostOrder();
    }

    // DFS - Iterative way
    public void traversePreOrderIterative(){
        if (root !=null)
            root.traversePreOrderIterative(root);
    }

    public void traverseInOrderIterative(){
        if (root !=null)
            root.traverseInOrderIterative(root);
    }

    public void traversePostOrderIterativeOneStack(){
        if (root !=null)
            root.traversePostOrderIterativeOneStack(root);
    }

    public void traversePostOrderIterativeTwoStack(){
        if (root !=null)
            root.traversePostOrderIterativeTwoStack(root);
    }

    public TreeNode get(int value){
        if (root!=null)
            return root.getValue(value);

        return null;
    }

    public int min(){
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return root.min();
    }

    public int max(){
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return root.max();
    }

    public void printLevelOrder() {
        if (root ==null)
            return;

        root.printLevelOrder(root);
    }

    public int heightRecursive(){
        return root.heightRecursive(root);
    }

    public int heightIterative(){
        return root.heightIterative(root);
    }



}
