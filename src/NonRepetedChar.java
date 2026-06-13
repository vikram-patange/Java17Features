import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepetedChar
{
    public static void main()
    {

        char[] arr = {'a', 'b', 'c', 'a', 'd', 'b', 'e'};

        Map<Character, Long> map    =new String(arr).chars().mapToObj(c -> (char) c)
                .collect(Collectors.
                        groupingBy(Function.identity(), Collectors.counting()));

        Character first_non_repeated = map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
System.out.println(first_non_repeated);

        //forEach(System.out::println);

        String s="swwiss";

        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));



        Character result = collect.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }

}
