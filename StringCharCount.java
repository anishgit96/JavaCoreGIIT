public class StringCharCount {

    public static void main(String[] args) {

        String str = "ANISH Is A SE";
        int i = 0, count = 0;
        while (str.length() > i) {
            count++;
            i++;
        }
        System.out.println(count);

    }
}
