public class StringUniqueCharcters {

    public static void main(String[] args) {

        String str = "abc243d";
        int i = 0;
        int j = i + 1;
        int flag = 0;
        while (i < str.length()) {
            while (j < str.length()) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("Matching Char");
                    flag = 1;
                    break;
                }
                j++;
            }
            i++;
        }
        if(flag==0)
        {
            System.out.println("Unique Char");
        }
    }
}
