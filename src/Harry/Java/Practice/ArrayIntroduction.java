package Harry.Java.Practice;

public class ArrayIntroduction {
    public static void main(String[] args) {
        // one out of three ways to show array
        int[] marks = new int[8];
        marks[0]= 26;
        marks[2]=28;
        marks[6]=26;
        marks[7]=29;

//        System.out.println(marks[2]);

        //  two out of three ways to show array
         String [] students;
         students = new String[11];
        students[0]= "Sumit";
        students[2]="Hari";
        students[6]="Himal";
        students[7]="Rabi";

//        System.out.println(students[7]);
//        System.out.println(students.length); //this is called array traversal.

//        for (int index = 0; index< 11; index++){
//            System.out.println(students[index]);
//        }

//        //For reverse print of the values.
//                for (int index = 0; index< 11; index++){
//            System.out.println(students[index]);
//        }


        //  third out of three ways to show array
        String [] employee ={"Sumit", "Hari", "Himal", "Rabi","Gopal"};

//        System.out.println(employee[2]);
////        System.out.println(employee.length);
//        Printing index in reverse order
//        for(int i=5-1; i>=0;i--){
//            System.out.println(employee[i]);
//        }
        //or
//        for(int index=employee.length-1; index>=0; index--){
//        System.out.println(employee[index]);}

//   Printing element only, not index.
//        for (String element: employee){
//            System.out.println(employee);
//        }






    }
}
