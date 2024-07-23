package generic;
import java.util.ArrayList;

public class GenericsInJava {

    public static void main(String[] args) {
        // Use generics to specify the type of elements in the ArrayList
        ArrayList<String> list = new ArrayList<>();

        list.add("JAVA");

        //list.add(123); // This line will cause a compile-time error because 123 is not a String

        for (String str : list) {
            // No need for type casting, as the list is type-safe
            System.out.println(str);
        }
    }
}



