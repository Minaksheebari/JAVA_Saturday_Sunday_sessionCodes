import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class randonNumGame {
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows, use "cls" command to clear the screen
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Unix-like systems (Linux, macOS), use ANSI escape sequence to clear the screen
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("*** WELCOME TO THE NUMBER MEMORY GAME ***");
        int score = 0;
        int numLength = 4;

        //Task 1 : Creating a random sequence of number
        int[] number = new int[numLength];

        for(int i=0;i<numLength;i++){
            number[i]=r.nextInt(10);
        }
        System.out.println("So Rember the given Number is:-"+ Arrays.toString(number));
        
        // Display output for few time laps
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            //Auto-generated catch block
            e.printStackTrace();
        }
        clearScreen(); //Clear screen function is written above main

        System.out.println("Enter your sequence answer: "); 
        for(int i=0;i<numLength;i++){
            int userInput = sc.nextInt();

            if(userInput != number[i]){
                System.out.println("Oops... Wrong Answer!!");
                break;
            }else{
                System.out.println("Well Done..!! Correct Sequence..");
                score++;
            }
        }

    }
}
