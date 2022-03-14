package List.DoublyLinkedList;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    public static int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if (head == null)
            tail = node;
        else
            head.setPrevious(node);

        head = node;
        size++;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current!= null){
            System.out.print(current.getEmployee());
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.print("Null");
    }
}
