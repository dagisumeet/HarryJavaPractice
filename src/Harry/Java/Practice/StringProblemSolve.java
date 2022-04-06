package Harry.Java.Practice;

public class StringProblemSolve {
    public static void main(String[] args) {


//    Porblem 1: Jave code to convert the String to lowercase.

    String name = "Sumit";
    name = name.toLowerCase();
        System.out.println(name);

//        Porblem 2: replace spaces with underlines.
        String name1 = "Sumit Dagi";
        name1 = name1.replace(' ', '*');

        System.out.println(name1);


//        Porblem 3: Fill in the letter in the template.
        String name3 = "Dear <|name|> thanks a lot.";
        name3 = name3.replace("<|name|>", "Sumit");
        System.out.println(name3);

//        Problem 4: write a java program that detect double and triple space in a java program.
        String myString ="This string contains double  and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        Problem 5: write a letter using escape sequences.

        String letter = "Dear Sumit. \n\tThis java course is nice.\n\tThanks";
        System.out.println(letter);


    }
}
