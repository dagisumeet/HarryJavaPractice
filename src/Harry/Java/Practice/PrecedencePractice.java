package Harry.Java.Practice;

public class PrecedencePractice {
    public static void main(String[] args) {

        int b = 60/5-34*2;
        int c = 34*2-60/5;
        System.out.println(b);
        System.out.println(c);
        // This will be the order = * & / has the same weightage but it is calculated first is divided by their position. 60/5 – 34*2 in this case 60/5 is calculated first and then 34*2 is calculated Whereas 34*2 -  60/5  in this case 34*2 is calculated first.
        // it goes left to right. it is evaluated on the basis of precedence value.
//        Operator precedance work as
//        PEMDAS
//        P - Parenthesis,
//        E - Exponential
//        M - Multiplication
//        D - Division
//        A - Addition
//        S - Subtraction
//        When two operator of same precedance are encountered(like [* /], [+ -]) it evaluates from left to right.

    }
}
