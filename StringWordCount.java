public class StringWordCount {

    public static void main(String[] args) {

        String str="Anish Is A SE";
        int i=0;
        int count=1;
        int flag=0;
        while (str.length() > i)
        {
            if(str.charAt(i) == ' ')
            {
                count++;
                flag=1;
            }
            i++;
        }
        if(flag==1)
        {
            System.out.println(count);
        }}
}
