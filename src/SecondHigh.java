import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigh {


    public static void main() {


        List<Integer> nubers= Arrays.asList(6,4,6,7,9,2,3,1);


        int secondLargest = findSecondLargest(nubers);

        System.out.println(secondLargest);


    }

    public static int findSecondLargest(List<Integer> numbers)
    {


        Integer secondHigh = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);


        return secondHigh;

    }
}
