
class Pair<T, U> {
    T x;
    U y;

    // Constructor to initialize the Pair
    public Pair(T x, U y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public U getY() {
        return y;
    }
}

class GFG1 {
    public static void main (String[] args) {
        // Create a Pair object with Integer and String
        Pair<Integer, String> p = new Pair<>(12, "GFG");
        
        // No need for casting; the types are enforced at compile time
        Integer intValue = p.getX();
        String strValue = p.getY();
        
        // Print the values
        System.out.println("p.x is an Integer: " + intValue);
        System.out.println("p.y is a String: " + strValue);
    }
}
