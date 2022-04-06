package Harry.Java.Practice;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {

//        Method to count the lenght of String
    String name = "Sumit";
        int value = name.length();// This method counts the lenght of String.
//        System.out.println(value);

//      Method to change to lowercase.
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

//        Method to change all to uppercase.
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);

//        Method to trim string. It clears the unnecessary spaces of String.
//        String nonTrimmedString = "      Sumit           ";
//        System.out.println(nonTrimmedString.trim());

//        SubStringMethod. It prints the letters on the basis of their index values.
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(1,4)); // Here first value is including and last value is excluded. Index value always starts from 0.

//        Replace method: It replaces the letter with another letter. First value is the value to be replaced and 2nd value is to be replaced by.
//        System.out.println(name.replace('u','a'));
//        System.out.println(name.replace("umi", "ana"));

////        StrartsWith method: this method checks if the object is starting with particular letter/s or not.
//        System.out.println(name.startsWith("Su"));
//        System.out.println(name.startsWith("Ui"));

////        EndsWith method: this method checks if the object is ends with particular letter/s or not.
//        System.out.println(name.endsWith("it"));
//        System.out.println(name.startsWith("im"));

//       Charat method: it returns the index value.
//        System.out.println(name.charAt(1));
//
//        Index of value: it tells what index position particular letter is in.
//        System.out.println(name.indexOf('u'));
//        System.out.println(name.indexOf("um",1));// it checks form the index value we have given.
//        System.out.println(name.lastIndexOf("um",3));// it checks form the index value falling at last.

//       equals method: it checks the value of the string.
        System.out.println(name.equals("Sumit"));
        System.out.println(name.equals("sumit")); // it is not equal becuase it starts with lowercase whereas the value starts with Uppercase.
//      We can avoid checking 'casing' by using following ignore-case method.
        System.out.println(name.equalsIgnoreCase("SuMiT"));
        System.out.println(name.equalsIgnoreCase("SaMiT"));
















    }
}

