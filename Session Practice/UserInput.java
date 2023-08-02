//import java.util.*; for all
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Scanner class will allow you to take input from user.
        int studId[] = new int[3];
        String names[] = new String[3];
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        int index = 0;

        while(index < 3){
            
        }
        for(int i=0;i<studId.length;i++){
            System.out.println("Enter student Id: ");
            studId[i] = sc.nextInt();      
        }
         for(int i=0;i<studId.length;i++){
            System.out.println("Your student Id is : " + studId[i]);

        sc.close(); //close the class object before ending main
        }
    }
}
