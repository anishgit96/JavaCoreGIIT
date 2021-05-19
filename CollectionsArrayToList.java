import java.util.*;

class CollectionsArrayToList {
    public static void main(String args[]) {

        String citynames[] = {"Deograh", "Jaisalmer", "Gurgaon"};

        ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));
        citylist.add("Udaipur");
        citylist.add("Jaipur");

        for (String str : citylist) {
            System.out.println(str);
        }
    }
}