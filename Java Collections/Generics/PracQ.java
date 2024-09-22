
class MyGen<T> {
    T x;
    static int count = 0;

    // Constructor to increment the count each time an object is created
    MyGen() {
        count++;
    }
}

public class PracQ {
    public static void main(String[] args) {
        // Create two objects of MyGen with different types
        MyGen<Integer> m1 = new MyGen<>();
        MyGen<String> m2 = new MyGen<>();

        // Static field is shared, so it will reflect the total number of objects created
        System.out.println(MyGen.count);  // Output: 2
    }
}
