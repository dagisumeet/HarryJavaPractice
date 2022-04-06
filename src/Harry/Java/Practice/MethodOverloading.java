package Harry.Java.Practice;

public class MethodOverloading {



    static void overLoading() {

        System.out.println("Good morning Sumit.");
    }

    static void overLoading(int a){

        System.out.println("Good Morning "+a+" bro");

// We can create methods 
    }
    public static void main(String[] args) {


        overLoading();
        overLoading(100); // (int a) is parameter and its value 100 is actual.They are kind of same. Arguments are actual.
    }


}

