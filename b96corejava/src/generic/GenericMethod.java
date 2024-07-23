package generic;

public class GenericMethod {

    // Generic method to display array elements
    public <T> void displayArrayElements(T[] elements) {
        // Generic method for displaying elements of an array
        for (T ele : elements) {
            System.out.println("Element is: " + ele);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        GenericMethod obj = new GenericMethod();

        Integer[] intArray = {10, 20, 30}; // Corrected array initialization
        String[] strArray = {"hello", "hai"}; // Corrected array initialization

        // Calling generic method with Integer array
        obj.displayArrayElements(intArray);

        // Calling generic method with String array
        obj.displayArrayElements(strArray);
        
    }
}
