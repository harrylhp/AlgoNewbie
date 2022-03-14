package Java8PlayGround;

public class DefaultAndStaticMethodInterface implements Interface1,Interface2
{
    @Override
    public void method2() {
    }

    @Override
    public void method1(String str) {
    }

    @Override
    public void log(String str) {
        System.out.println("Main logging::"+str);
    }

    public static void main(String[]args){
        DefaultAndStaticMethodInterface ins = new DefaultAndStaticMethodInterface();
        ins.log("Main Log");
        Interface1.print("Hello");
        Interface2.print("Hello");
    }
}

interface Interface1 {

    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void print(String str){
        System.out.println("I1 printing::"+str);
    }
}

interface Interface2 {

    void method2();

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }

    static void print(String str){
        System.out.println("I2 printing::"+str);
    }

}

