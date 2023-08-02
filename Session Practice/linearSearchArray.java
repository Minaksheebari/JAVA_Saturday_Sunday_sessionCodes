import java.util.Arrays;
import java.util.Scanner;

public class linearSearchArray {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Please enter the length of array: ");
        int length = s1.nextInt();
        
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[length];
        
        for(int i=0;i<length;i++){   //Storing values in array
            arr[i] = s1.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr));

        System.out.println("Enter number to search: ");
        int target = s1.nextInt();
        int index = linearsearch(length, arr, target);

        if(index==-1){
            System.out.println("Not Found..!!");
        }else{
            System.out.println("Element found at position: " + index);
        }
        s1.close();
    }
    public static int linearsearch(int len, int[]arr,int target){
        for(int i=0;i<len;i++){
            if(arr[i]==target) return i+1;
        }
        return -1;
    }
}
