public class StringEqualityTest {
    public static void main(String[] args) {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        String s3="HELLO";
        System.out.println(s1 == s2); //false Both addresses are different
        System.out.println(s1.equals(s2));//true  Both the value are same
        System.out.println(s1==s3);//false   Both addresses are different
    }
}