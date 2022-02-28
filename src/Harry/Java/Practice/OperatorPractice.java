package Harry.Java.Practice;


import java.util.Scanner;


public class OperatorPractice {
    public static void main(String[] args) {
               int a = 4; // arithmetic operator
        int b = 6 +a;
        int c = 6 % a; //modular operator
        double g = 4.8%2.1; //returns decimal reminder
        int d = 9;
        d += 6;
        int e = 20;
        e *= 2;

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.printf("%.1f",g);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a == b); //comparison  operator
        System.out.println(d>e); // comparison operator
        System.out.println(e>d); //comparison operator

        // Logical Operator
        System.out.println(64>5 && 64>68);
        System.out.println(64>5 && 64>60);
        // "&&" in this case if both case is true, it says yes otherwise no
        System.out.println(64>70 || 64>68);
        System.out.println(64>5 || 64>60);
        // in this case, if anyone of case is ture, then it will be true. If both cases are false, then it shows false.




    }

}
