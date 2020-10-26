import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        System.out.println("ArrayList demo");

        ArrayList<String> cars = new <String>ArrayList();

        cars.add("Trabant");
        cars.add("Opel");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Tesla");

        System.out.println(cars);
        System.out.println(" Det første element er: " + cars.get(0));
        System.out.println(" Det tredje element er: " + cars.get(2));

        cars.set(2, "Ford");

        System.out.println(" Det tredje element er: " + cars.get(2));

    //    System.out.println(" Der er %d biler i listen%n", cars.size());
    }
}
