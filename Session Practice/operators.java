// operators in java
// Arithmatic - +,-,*,/,%
// Assignment operator:  =
public class operators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        int result = 0;
        result = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + result);

        result = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + result);

        result = num1 / num2;
        System.out.println("Division of " + num1 + " and " + num2 + " is " + result);

        result = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + result);

        result = num1 % num2;
        System.out.println("Reminder of " + num1 + " and " + num2 + " is " + result);

        // Increament operator ++
        num1++;
        System.out.println("Increamet of Num 1: " + num1);
        
        // Decreament Operator --
        num1--;
        System.out.println("Decreament of Num 1: " + num1);

        //Increamental assignment operator +=
        num1 += 3;      //num1 = num1 + 3
        System.out.println("Num 1 after += is: " + num1);

        //Decreamental assignment operator -=
        num1 -= 3;
        System.out.println("Num 1 after -= is: " + num1);

        //Multiply assignment operator *=
        num1 *= 3;
        System.out.println("Num 1 after *= is: " + num1);

        //Division assignment operator /=
        num1 /= 3;
        System.out.println("Num 1 after /= is: " + num1);

        //Preincreament 
        System.out.println("Num 2 is: " + num2);
        ++num2;
        System.out.println("Num 2 after PreIncreament: " + num2);
    }

}
