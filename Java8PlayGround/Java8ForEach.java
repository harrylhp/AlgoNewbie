package Java8PlayGround;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<10; i++)
            System.out.println("List is : " + list.get(i));

        // 1. To printOut using Iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("My list is "+ it.next());
        }

        // 2. To printOut using forEach in Iterator interface -> long (as need to create accept method below)
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Foreach in wrapper class " + integer);
            }
        });

        // 3. To printOut using forEach with lambda expression
        list.forEach(p -> System.out.println("For each with lamdas " + p));

    }

    //Consumer implementation that can be reused
    //Add for commit
    //Add for commit from iMac
    //Add commit from macbook pro
    //Remove from macbook pro
    //Add in
    class MyConsumer implements Consumer<Integer>{
        public void accept(Integer t) {
            System.out.println("Consumer impl Value::"+t);
        }


    }
}
