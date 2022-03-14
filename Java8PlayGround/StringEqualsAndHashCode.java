package Java8PlayGround;

public class StringEqualsAndHashCode {
    public static void main(String[] args) {

        String firstString = "Gaurav";
        String secondString = "Gaurav";

        String thirdString =  new String("Gaurav");

        System.out.println("HashCode String 1 : " +firstString.hashCode());
        System.out.println("HashCode String 2 : " +secondString.hashCode());
        System.out.println("HashCode String 3 : " +thirdString.hashCode());

        //First and Second are referring to same object. The "==" will compare the reference
        System.out.print("Case 1 : ");
        System.out.println(firstString == secondString); // true
        System.out.println("HashCode String 1 : " +firstString.hashCode());
        System.out.println("HashCode String 2 : " +secondString.hashCode());

        System.out.print("Case 2 : ");
        System.out.println(firstString == thirdString); // false

        // Comparing strings using equals() method
        System.out.print("Case 3 : ");
        System.out.println(firstString.equals(thirdString)); // true

        //
    }
}
