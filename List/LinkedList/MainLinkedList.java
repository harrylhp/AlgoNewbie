package List.LinkedList;

public class MainLinkedList {
    public static void main(String[]args){
        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(new Employee("Jane", "Jones", 1));
        list.addToFront(new Employee("John", "Doe", 2));
        list.addToFront(new Employee("Mary", "Smith", 3));
        list.addToFront(new Employee("Mike", "Wilson", 4));

        list.printList();
        System.out.println();
        System.out.println("Size of list: " + EmployeeLinkedList.size);

        System.out.println();
        System.out.println("Reversed Linked List");
        list.reverseLinkedList();
        list.printList();

        System.out.println();
        list.setHead(list.reverseLinkedListRecur(list.getHead()));
        list.printList();
    }
}
