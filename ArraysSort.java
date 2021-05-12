import java.util.Arrays;
                                         //M-I
public class ArraysSort
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
                                        //M-II
/*
public class ArraysSort {
    public static void main(String[] args) {
        // Our arr contains 8 elements
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
*/