package List.DoublyLinkedList;

public class MainDoublyLinkedList {
    public static void main(String[]args){
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(new Employee("Jane", "Jones", 1));
        list.addToFront(new Employee("John", "Doe", 2));
        list.addToFront(new Employee("Mary", "Smith", 3));
        list.addToFront(new Employee("Mike", "Wilson", 4));

        list.printList();
        System.out.println();
        System.out.println("Size of list: " + EmployeeDoublyLinkedList.size);

    }
}
