//import java.util.*;
//
//    public class ArraysJsonToStringAr {
//
//        public static void main(String[] args)
//        {
//            // Initialising a JSON example array
//            JSONArray exampleArray = new JSONArray();   //****Just put json dependency in gradle or pom.xml
//
//            // Entering the data into the array
//            exampleArray.put("Anish");
//            exampleArray.put("GIIT");
//            exampleArray.put("Solutions");
//
//            // Printing the contents of JSON example array
//            System.out.print("Given JSON array: "
//                    + exampleArray);
//            System.out.print("\n");
//
//            // Creating example List and adding the data to it
//            List<String> exampleList = new ArrayList<String>();
//            for (int i = 0; i < exampleArray.length; i++) {
//                exampleList.add(exampleArray.getString(i));
//            }
//
//            // Creating String array as our
//            // final required output
//            int size = exampleList.size();
//            String[] stringArray
//                    = exampleList.toArray(new String[size]);
//
//            // Printing the contents of String array
//            System.out.print("Output String array will be : ");
//            for (String s : stringArray) {
//                System.out.print(s);
//            }
//        }
//    }