package Harry.Java.Practice.ConcurrencyPractice;

class MyThread1 extends Thread {  //Here we have to extend the Thread class.
    @Override // Here we have to override the run() method that is inside the thread class.
    public void run() { // We are calling the run() method.
        int i=0;
        while(i<100) {
            System.out.println("Sumit Dagi");
            i++;
        }

    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {

        int i=0;
        while(i<100) {
            System.out.println("Mary");
            i++;
        }


    }
}

public class MultithreadingPractice {

      public static void main(String[] args) {

          MyThread1 t1 = new MyThread1();  // We call the method of above classes.
          MyThread2 t2 = new MyThread2();

          t1.start(); // To need to call ".start()" method to initiate the thread.
          t2.start();


    }
}
