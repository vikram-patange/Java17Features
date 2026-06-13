import java.util.random.RandomGenerator;

public class RandomNumberGenerator
{

    public static void main(String[] args)
    {

        RandomGenerator generator = RandomGenerator.getDefault();
        System.out.println(generator.nextInt(100));


    }

}
