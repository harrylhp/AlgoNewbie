package Java8PlayGround;

public class ClassInitializer {
    public void myMethod() {
        System.out.println("Method");
    }

    {
        System.out.println("Instance Block");
    }

    public void ClassInitializer() {
        System.out.println("Constructor ");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        ClassInitializer c = new ClassInitializer();
        c.ClassInitializer();
        c.myMethod();
    }
}
