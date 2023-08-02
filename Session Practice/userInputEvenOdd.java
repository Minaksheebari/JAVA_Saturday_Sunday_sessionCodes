import java.util.Scanner;

public class userInputEvenOdd {
    public static void main(String[] args) {
        
        //WAP to take input from user and guess if it is even || odd and print sum of even & odd number.
        int number, sumEven=0, sumOdd=0;
        char choice;

        Scanner s1 = new Scanner(System.in);
        do{
            System.out.println("Enter a number: ");
            number= s1.nextInt();

            if(number%2==0){
                sumEven+=number;
            }else{
                sumOdd+=number;
            }
            System.out.println("Do you wnat to continue(y/n): ");
            choice=s1.next().charAt(0);
        }while(choice=='y' || choice == 'Y');

        System.out.println("Sum of EVEN integers: " + sumEven);
        System.out.println("Sum of ODD integers: " + sumOdd);
    }
}
