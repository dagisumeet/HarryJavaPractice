package Harry.Java.Practice;

class Base {
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int printMe() {
        System.out.println("I am a constructor");
        return 0;
    }
}

    class Derived extends Base{

        }




