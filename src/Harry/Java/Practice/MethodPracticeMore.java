package Harry.Java.Practice;

// Through this way we can change the value of any index using below method.

public class MethodPracticeMore {

    static void change(int[] marks){
        marks[0] = 100; // Here we assigned the value of 0 index 100 whereas its value in the below method was 52. Now the value will be changed.

    }

    public static void main(String[] args) {

        int[] marks = {52,53,77,75,80};
       change(marks);


        System.out.println("The change value of 0 index of array is " + marks[0]);

    }


}
