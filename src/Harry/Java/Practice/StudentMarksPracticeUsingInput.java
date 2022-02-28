package Harry.Java.Practice;

import java.util.Scanner;

public class StudentMarksPracticeUsingInput {
    public static void main(String[] args) {
        Scanner marksPercentage = new Scanner(System.in);

        System.out.print("Enter your Science marks: ");
        float science = marksPercentage.nextFloat();
        System.out.print("Enter your Math marks: ");
        float math= marksPercentage.nextFloat();
        System.out.print("Enter your Computer marks: ");
        float computer = marksPercentage.nextFloat();
        System.out.print("Enter your Social marks: ");
        float social= marksPercentage.nextFloat();

        float percentage = (science+math+computer+social)/400*100;
        System.out.println("Total percentage obtained by Sumit is "+percentage+ " %"+".");






    }

        }
