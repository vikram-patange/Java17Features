public class InstanceOf
{

    public static void main()
    {

        Object obj="vikram";
        if (obj instanceof  String s)
        {
            System.out.println(s.toUpperCase());

        }
        else if(obj instanceof  Integer i)
        {
            System.out.println(i + 10);
        }


        switch (obj)
        {

            case  String s -> System.out.println(s.toUpperCase());
            case  Integer i->System.out.println(i + 10);
            case  null -> System.out.println(
                    "Obj is null"
            );
            default -> {}
        }
            }

}
