public class StringVowlesCalculation {

    static int i, c, res;

    static int vowelCount(String s) {
        for (i = 0, c = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
                c++;
        }
        return c;
    }

    public static void main(String args[]) {
        res = StringVowlesCalculation.vowelCount("anish is having an orange");
        System.out.println("Total No Of Vowles Are  :" + res);
    }
}

