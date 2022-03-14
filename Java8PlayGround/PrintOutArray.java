package Java8PlayGround;

import java.util.Arrays;

public class PrintOutArray {
    public static void main(String []args){
        String[] strArray = new String[]{"Java", "Node", "Python", "Ruby"};

        System.out.println("Simple array printing with stream and forEach");
        Arrays.stream(strArray).forEach(System.out::println);

        System.out.println("Use Arrays.toString");
        System.out.println(Arrays.toString(strArray));

    }
}
