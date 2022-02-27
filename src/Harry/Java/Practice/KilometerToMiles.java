package Harry.Java.Practice;

import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
      double km;
      double miles;
      Scanner input = new Scanner(System.in);
        System.out.println("Inter the distance in Kilometers:");
        km= input.nextDouble();
        input.close();

       miles = (km * 0.621371);

        System.out.printf("%.2f Kilometer = %.2f miles",km, miles);




    }

}
