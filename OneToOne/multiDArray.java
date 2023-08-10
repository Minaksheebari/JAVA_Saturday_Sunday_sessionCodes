import java.util.Arrays;
import java.util.Scanner;

class multiDArray {
    public static void main(String[] args) {
        int[] nums = { 10, 50, 60, 40, 20 }; // array declaration
        int[] numOne;

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        numOne = new int[len]; // dynamic array allocation

        // how to traverse array using in built methods.
        // in built methods for string class.

        // System.out.println("Before sorting: " + Arrays.toString(nums));         //built in 
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}