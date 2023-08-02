//Question 1:  Find Count, Min, Max and Average values from the given array -

import java.util.Scanner;

public class QueOneArrayOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array you want: ");
        int len = sc.nextInt();

        int[] numbersArray = new int[len];

        System.out.println("Enter " + len + " numbers: ");
        for(int i=0;i<len;i++){
            numbersArray[i]=sc.nextInt();
        }

        //printing array
        System.out.println("Your array elements are: ");
        for (int i : numbersArray) {
            System.out.print(i + " ");
        }

        //Count array elements
        System.out.println("\n"+"Total number of array elements (Count): " + numbersArray.length);

        //Mimimum value elements
        int minVal = numbersArray[0];
        for(int i=1;i<numbersArray.length;i++){
            if(numbersArray[i]<minVal){
                minVal = numbersArray[i];
            }
        }
        System.out.println("The element with the Minimum value is: " + minVal);
        
        //Maximum value elements
        int maxVal = numbersArray[0];
        for(int i=1;i<numbersArray.length;i++){
            if(numbersArray[i]>maxVal){
                maxVal = numbersArray[i];
            }
        }
        System.out.println("The element with the Maximum value is: " + maxVal);
        
        //Average of all array elements
        int total = 0;
        for (int i : numbersArray) {
            total+=i;
        }
        double avg = total/len;

        System.out.println("Total of all array elements is: " + total);
        System.out.println("Average of all array elements is: " + avg);
        
    }
}
