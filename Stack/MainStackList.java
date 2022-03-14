package Stack;

public class MainStackList {
    public static void main(String[]args){
        LinkedStack stack = new LinkedStack();
        stack.push(new Employee("Jane", "Jones", 1));
        stack.push(new Employee("John", "Doe", 2));
        stack.push(new Employee("Mary", "Smith", 3));
        stack.push(new Employee("Mike", "Wilson", 4));

        stack.printStack();
        stack.pop();

        System.out.println("After Pop");
        stack.printStack();

        System.out.println("Peek " +stack.peek());

    }
}
