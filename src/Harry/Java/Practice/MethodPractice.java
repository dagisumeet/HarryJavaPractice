package Harry.Java.Practice;



public class MethodPractice {

     static int logic (int x, int y) {

        int z;
        if (x<y) {
            z= (x*y);
        }
        else {
            z= x*y*2;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int c = logic(a,b);


        int a1 = 10;
        int b1 = 8;
        int c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
