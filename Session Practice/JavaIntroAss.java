public class JavaIntroAss {
    public static void main(String[] args) {
        // Question 1: The Relational Operators (==, !=, <=,>=)

        int num1 = 10;
        int num2 = 20;

        boolean equal = num1==num2;
        System.out.println("Equal : " + equal);

        boolean notEqual = num1!=num2;
        System.out.println("Not Equal: " + notEqual);

        boolean greaterThan = num1>=num2;
        System.out.println("num1 is Greater Than num2: " + greaterThan);

        boolean lessThan = num1<=num2;
        System.out.println("num1 is Less Than num2: " + lessThan);

        //The Assignment Operators (+=, -=, *=, /=, %=)
        System.out.println("======================================");

        num1 += 2;
        System.out.println("After addition: num = " + num1);

        num1 -= 4;
        System.out.println("After subtraction: num = " + num1);

        num1 *= 7;
        System.out.println("After multiplication: num = " + num1);

        num1 /= 4;
        System.out.println("After division: num = " + num1);

        num1 %= 4;
        System.out.println("After modulus: num = " + num1);

        System.out.println("======================================");
    }
}