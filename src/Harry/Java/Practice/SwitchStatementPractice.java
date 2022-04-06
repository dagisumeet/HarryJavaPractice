package Harry.Java.Practice;

import java.util.Scanner;

public class SwitchStatementPractice {
    public static void main(String[] args) {
        System.out.println("Enter you age:");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();


        switch (age) {
            case 10 -> System.out.println("You are underage.");
            case 16 -> System.out.println("You are eligible to get learner's permit.");
            case 18 -> System.out.println("You ar eligible to obtain driver's license.");
            default -> {
                System.out.println("You are free to do anything.");

                //Before JDK 17, this is how switch code used to be writeen.
//                switch (age) {
//                    case 10:
//                        System.out.println("You are underage.");
//                        break;
//                    case 16:
//                        System.out.println("You are eligible to get learner's permit.");
//                        break;
//                    case 18:
//                        System.out.println("You ar eligible to obtain driver's license.");
//                        break;
//                    default:
//                        System.out.println("You are free to do anything.");


                }
            }
        }
}
