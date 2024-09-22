
import java.util.HashSet;

public class PrintRepeating {
    
    static void printRepeating(int arr[])
    {
        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++)
        {
            if (s.contains(arr[i]) == true)
            {
                System.out.println(arr[i] + " ");
            }
            else 
            {
                s.add(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 8, 10, 8};

        printRepeating(arr);
    }
}
