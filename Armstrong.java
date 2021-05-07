public class Armstrong {

    public static void main(String[] args) {

        int sum = 0, rem = 0;
        int num = 153;
        int temp = 0;
        temp = num;

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        if (temp == sum) {
            System.out.println("armstrong number");
        } else
            System.out.println("Not an Armstrong Number");
    }
}
