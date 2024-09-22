import java.util.*;

public class PrintIntersection {
    static void printIntersect(int a[], int b[]) {
        HashSet<Integer> s = new HashSet<Integer>();
        HashSet<Integer> printed = new HashSet<Integer>();  // To avoid printing duplicates
        
        // Add elements from array b to the HashSet
        for(int i = 0; i < b.length; i++) {
            s.add(b[i]);
        }
        
        // Check for intersection and avoid duplicate prints
        for(int i = 0; i < a.length; i++) {
            if(s.contains(a[i]) && !printed.contains(a[i])) {
                System.out.print(a[i] + " ");
                printed.add(a[i]);  // Mark element as printed
            }
        }
    }
    
    public static void main(String[] argv) {
        // First array arr1[]
        int arr1[] = {10, 15, 20, 25, 30, 50};
        
        // Second array arr2[]
        int arr2[] = {30, 5, 15, 80};
        
        // Calling the Intersect method
        printIntersect(arr1, arr2);
    } 
}
