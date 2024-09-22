
import java.util.ArrayList;

class Student {

}

class EnggStudent extends Student {

}

public class Wildcard1 {

    public static void main (String[] args) {

        ArrayList<? super Student> al1 = new ArrayList<>();  // al1 can accept any superclass of Student
        ArrayList<Object> al2 = new ArrayList<>();  // al2 is an ArrayList of Object
        
        // al1 can be assigned al2 since Object is a superclass of Student
        al1 = al2;
        
        // You can add instances of Student or subclasses to al1
        al1.add(new Student());
        al1.add(new EnggStudent());

        // You cannot retrieve items as Student or EnggStudent directly since it's a super type of Student
        Object obj = al1.get(0);  // Only safe to assign the retrieved object to Object
    }
}
