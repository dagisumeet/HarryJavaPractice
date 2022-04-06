package Harry.Java.Practice;

public class VarArgs {

    static int sum(int a, int b){

                return (a+b);
    }

    static int sum(int a, int b, int c){

        return (a+b+c);
    }
    public static void main(String[] args) {
        System.out.println("Var args tutorials.");
        System.out.println("The sum of a & b is:"+ sum(4, 5));
    }
}
