package zProblem;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayWithStream {
    public static void main(String[]args){
        Stream<String> e = Stream.of("ab", "aa", "ac");
        List<String> eList = e.collect(Collectors.toList());

        List<String> elements =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"))
                        .collect(Collectors.toList());

        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();

        System.out.println(e);
        System.out.println(eList);
        System.out.println(elements);
        System.out.println(anyElement);
        System.out.println(firstElement);
    }
}
