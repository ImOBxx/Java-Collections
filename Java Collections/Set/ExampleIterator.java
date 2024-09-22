import java.util.HashSet;
import java.util.Iterator;

public class ExampleIterator {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("gfg");
        h.add("courses");
        h.add("ide");

        // Print the HashSet
        System.out.println(h);

        // Check if "ide" is present in the HashSet
        System.out.println(h.contains("ide"));

        // Use java.util.Iterator to iterate over the HashSet
        Iterator<String> i = h.iterator();

        // Iterate through the elements in the HashSet
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
    }
}

