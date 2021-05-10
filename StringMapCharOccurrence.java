import java.util.HashMap;

public class StringMapCharOccurrence {

    public static void main(String[] args) {

        String str="Java is Java";

        HashMap<Character, Integer> eachCharCount = new HashMap<>();
        char[] charArray = str.toCharArray();

        for(char c : charArray)
        {
            if(eachCharCount.containsKey(c))
            {
                eachCharCount.put(c,eachCharCount.get(c)+1);
            }
            else
            {
                eachCharCount.put(c,1);
            }
        }
        System.out.println(eachCharCount);
    }
}