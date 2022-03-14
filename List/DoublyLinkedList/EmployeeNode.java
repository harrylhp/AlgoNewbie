package List.DoublyLinkedList;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode (Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee(){
        return employee;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public void setNext(EmployeeNode next){
        this.next = next;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setPrevious(EmployeeNode previous){
        this.previous = previous;
    }

    public EmployeeNode getPrevious(){
        return previous;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
