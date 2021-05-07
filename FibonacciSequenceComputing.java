public class FibonacciSequenceComputing {

    public static void main(String[] args) {

        int n1=0;
        int n2=1;
        int n3=0;
        int max=200;

        System.out.print(n1);
        System.out.print(" "+n2);

        while(n3<max) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" "+ n3);

        }
    }
}
