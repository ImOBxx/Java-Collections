

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
        // Create a Set using HashSet
        Set<Integer> s = new HashSet<>();

        // Add elements to the set
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(20);  // Duplicate value

        // Print the set
        System.out.println(s);
    }
}
