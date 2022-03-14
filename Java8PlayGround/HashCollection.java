package Java8PlayGround;

import java.util.*;

public class HashCollection {
    private String berry = "Blue";
    public static void main(String []args){
        LinkedList<Integer> iList = new LinkedList<>();
        iList.add(5);
        iList.add(2);
        iList.add(3);
        iList.forEach(p -> System.out.println("Element in List "+p));

        //Convert the List into array
        //Howtohttps://www.delftstack.com/howto/java/how-to-convert-integer-list-to-int-array-in-java/
        //Integer[] array = (Integer[]) iList.stream().toArray(); //Cannot use this way

        int [] array = iList.stream().mapToInt(i->i).toArray(); //or mapToInt(Integer::intValue)
        for (int i=0; i<array.length; i++) {
            int value = (int) array[i];
            System.out.println("Value in MapToInt is " + value);
        }

        //Initialize ArrayList String
        List<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello", "World"));

        for (String str : places)
            System.out.println("Value of String in Stream is : " +str);

        StringBuilder sb = new StringBuilder("hello");
        sb.deleteCharAt(0).insert(0, "H").insert(sb.length()," World!");
        System.out.println(sb);

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(55);
        pQueue.add(99);
        pQueue.add(1);
        pQueue.add(102);
        pQueue.add(54);
        pQueue.add(51);
        System.out.println(pQueue);

        while (!pQueue.isEmpty()){
            System.out.println(pQueue.remove());
        }

        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(1,3,7,5,9));
        aList.forEach(p -> System.out.println("Item in ArrayList " + p));

        HashCollection instance = new HashCollection();
        instance.juicy("BLUE"); //When we call this method juicy from instance, no need to define it as static
    }

    public void juicy(String berry){
        this.berry = "Straw";
        System.out.println(this.berry + "Berry");
    }

}
