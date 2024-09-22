
class Pair<T, S> {
    T x;
    S y;
}

public class GenericsString {
    public static void main(String[] args) {
        // Create a Pair object with Integer and String
        Pair<Integer, String> p = new Pair<Integer, String>();

        // Assign values to the Pair fields
        p.x = 12;           // Integer value
        p.y = "GFG";        // String value

        // Correct handling without casting error
        Integer intValue = p.x;    // No casting needed, it's already Integer
        String strValue = p.y;     // No casting needed, it's already String

        // Print the values
        System.out.println("p.x is an Integer: " + intValue);
        System.out.println("p.y is a String: " + strValue);
    }
}
