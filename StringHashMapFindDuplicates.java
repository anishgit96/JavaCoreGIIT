// Java program for the above approach
import java.util.*;
//https://bytesofgigabytes.com/java/collection-framework-in-java/
class StringHashMapFindDuplicates {

    public static void main(String[] args) {

        String str = "Java Is Java";
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] charArray = str.toCharArray();

        for(char c : charArray)
        {
            if(c==' ')
            {
                continue;
            }
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }
        } }
}