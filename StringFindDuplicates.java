public class StringFindDuplicates {
    public static void main(String[] args) {

        String str="JAVA IS JAVA";
        char[] chars = str.toCharArray();

        for (int i=0; i<chars.length; i++)
        {
            int count=1;
            if(chars[i]==' ' || chars[i]==0)
            {
                continue;
            }
            for(int j=i+1; j<chars.length; j++)
            {
                if(chars[i]==chars[j]) {
                    chars[j] = 0;
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(chars[i]);
            }
        }
    }


}
;