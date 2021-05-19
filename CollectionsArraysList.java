/* ArrayList:ArrayList which is implemented in the collection framework
        provides us dynamic arrays in Java.Though,it may be slower than standard arrays
        but can be helpful in programs where lots of manipulation in the array is needed.Let’s see how to create a
        list object using this class.
*/

import java.io.*;
import java.util.*;

class CollectionsArraysList {
    public static void main(String[] args) {
        // Size of ArrayList
        int n = 5;
        // Declaring the List with initial size n
        List<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new elements
        // at the end of the list
        for (int i = 1; i <= n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying the list after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");
    }
}
