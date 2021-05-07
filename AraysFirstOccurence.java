public class AraysFirstOccurence {

    private static void firstOccurence(int[] arr1, int num) {

        int f1=-1;

        for (int i=0; i<arr1.length; i++)
        {
           if(num!=arr1[i])
             continue;
           if(f1==-1)
           {
               f1=i;
           }
        }
        if(f1!=-1)
        {
            System.out.println(f1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 5;
       firstOccurence(arr,num);
    }
}