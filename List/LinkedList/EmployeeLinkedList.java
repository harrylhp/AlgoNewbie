package List.LinkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    public static int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void reverseLinkedList(){
        EmployeeNode previous = null;
        EmployeeNode current = head;
        EmployeeNode next;

        while (current!=null){
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        head = previous;
    }

    public EmployeeNode reverseLinkedListRecur(EmployeeNode node){
        EmployeeNode first;
        if(node ==null || node.getNext()==null)
            return node;

        first = reverseLinkedListRecur(node.getNext());
        node.getNext().setNext(node);
        node.setNext(null);

        return first;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current!= null){
            System.out.print(current.getEmployee());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("Null");
    }

    public EmployeeNode getHead(){
        return head;
    }

    public void setHead(EmployeeNode head){
        this.head = head;
    }
}
