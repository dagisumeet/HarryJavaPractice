package Harry.Java.Practice.ConcurrencyPractice;
class Runnable1 implements Runnable{

    @Override
    public void run() {
        int i=0;
        while(i<10000) {
            System.out.println("Mary");
            i++;
        }
    }
}

class Runnable2 implements Runnable{

    @Override
    public void run() {
        int i=0;
        while(i<10000) {
            System.out.println("Sumit");
            i++;
        }
    }
}

public class RunnablePractice{
    public static void main(String[] args) {


        Runnable1 bullet1 = new Runnable1();
        Thread gun1 = new Thread(bullet1);


        Runnable2 bullet2 = new Runnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }


}
