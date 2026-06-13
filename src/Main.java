//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Product p1=new Product("cycle" ,10000);
    Product p2=new Product("cycle" ,10000);

    System.out.println(p1.name());
    System.out.println(p1.price());

    System.out.println(p1.toString());
    System.out.println(p1.equals(p2));
    System.out.println(p1.hashCode());






}
