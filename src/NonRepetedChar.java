import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NonRepetedChar {
    public static void main() {

        char[] arr = {'a', 'b', 'c', 'a', 'd', 'b', 'e'};
        List<Character> arrList = new String(arr).chars()
                .mapToObj(c -> (char) c).
                collect(Collectors.toList());
        arrList.forEach(System.out::println);


        Map<Character, Long> map = new String(arr).chars().mapToObj(c -> (char) c)
                .collect(Collectors.
                        groupingBy(Function.identity(), Collectors.counting()));

        Character first_non_repeated = map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println(first_non_repeated);

        //forEach(System.out::println);

        String s = "swwiss";

        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        StringBuffer s11 = new StringBuffer("Vikram");
        String s12 = "Vikram";
        String s13 = "Vikram";

        System.out.println(s11.toString().equals(s12.toString()));

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println(sb1.equals(sb2));
        System.out.println(sb1 == sb2);

        System.out.println(s12 == s13);

        String str = "Deloitee is a good compnay .Deloitte has a good working culture ";

        String[] word = str.split(" ");

        for (String w : word) {
            System.out.println(w);
        }
        IntStream.range(0, word.length)
                .filter(i -> word[i].contains("Deloitte"))
                .forEach(System.out::println);


        Map<Integer, String> mapp = new HashMap<>();
        mapp.put(1, "Java");
        mapp.put(2, "Spring");
        mapp.put(3, "Kafka");


        Stream<Integer> mapKeyStream = mapp.keySet().stream();
        mapKeyStream.forEach(System.out::println);


        Stream<Map.Entry<Integer, String>> keyValuePair = mapp.entrySet().stream();

        keyValuePair.forEach(System.out::println);

        mapp.keySet()
                .stream()
                .filter(key -> key > 1)
                .forEach(System.out::println);


        mapp.entrySet().stream().
                filter(e -> e.getValue().startsWith("S"))
                .map(Map.Entry::getValue)
                .forEach(System.out::println);

        boolean b = mapp.entrySet().stream().
                anyMatch(e -> e.getKey().equals(1));
        System.out.println(b);


        List<Integer> arrLit = Arrays.asList(15, 5, 10, 20);

        Integer secondHigh = arrLit.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(null);

        System.out.println(secondHigh);


        String stri = "i love java";

        Map<Character, Long> frequ = stri.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting()));

        System.out.println(frequ);


    }
}
