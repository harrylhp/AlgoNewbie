package Tree;

public class MainTree {
    public static void main(String [] args){
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(15);
        tree.insert(22);
        tree.insert(26);
        tree.insert(30);
        tree.insert(29);
        tree.insert(32);
        tree.insert(23);

        System.out.println("Traverse Pre Order (Recursion)");
        tree.traversePreOrder();
        System.out.println();

        System.out.println("Traverse In Order (Recursion) ");
        tree.traverseInOrder();
        System.out.println();

        System.out.println("Traverse Post Order (Recursion)");
        tree.traversePostOrder();
        System.out.println();

        System.out.println("-----------------------------------");
        System.out.println("Traverse Pre Order (Iterative Way)");
        tree.traversePreOrderIterative();
        System.out.println();

        System.out.println("Traverse In Order (Iterative Way)");
        tree.traverseInOrderIterative();
        System.out.println();

        System.out.println("Traverse Post Order One Stack (Iterative Way)");
        tree.traversePostOrderIterativeOneStack();
        System.out.println();

        System.out.println("Traverse Post Order Two Stack (Iterative Way)");
        tree.traversePostOrderIterativeTwoStack();
        System.out.println();
        /*
        System.out.println("Node is " + tree.get(26).getData());
        System.out.println("Node is " + tree.get(55));

        System.out.println("Min is " + tree.min());
        System.out.println("Max is " + tree.max());
        */

        System.out.println("-----------------------------------");
        System.out.println("Traverse Level Order");
        tree.printLevelOrder();

        System.out.println();
        System.out.println("Height of the Tree: " + tree.heightRecursive());

        System.out.println();
        System.out.println("Height of the Tree(Iterative) : " + tree.heightIterative());

        tree.delete(20);
        tree.printLevelOrder();
        System.out.println();
    }
}
