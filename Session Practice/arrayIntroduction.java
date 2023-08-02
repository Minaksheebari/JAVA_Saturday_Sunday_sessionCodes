import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayIntroduction {
    public static void main(String[] args) {

        // declaring & creating an array list
        int[] arr;
        arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // arr[3] = 40; //ArrayOutOfBoundIndexError
        System.out.println(arr[2]);

        int[] arr2 = { 100, 200, 300 };
        System.out.println(arr2[2]);

        String[] sarr = { "Minu", "Urvi", "Vaibhav", "Faisal", "Sohail", "Neeraj" };
        // System.out.println(sarr[1]);

        // for loop - initialization, condition, increament
        for (int i = 0; i < sarr.length; i++) { // here length is a property so that we are not using () after length
            System.out.print((i + 1) + "=" + sarr[i] + "\t\t");
        }

        // for each loop - enhanced loop which makes syntax easy
        // Directly targeting your elements
        for (String i : sarr) {
            System.out.println(i + "\t");
        }

        // Write a Java program to check if an array contains a specific element.
        // Method 1 : Using foreach & flag
        int[] searchArr = { 2, 4, 5, 6, 7, 8 };
        int search = 9;
        boolean flag = false;

        for (int i : searchArr) {
            if (i == search) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Element is present.");
        } else {
            System.out.println("Element is NOT present.");
        }

        // Method 2 : Binary Search - Only applicable on sorted array, you will get
        // index as output
        Arrays.sort(searchArr);
        int index = Arrays.binarySearch(searchArr, search);
        System.out.println("Value present at: " + index);
        // refer notebook

        // Write a Java program to fill an array with a specific value.
        int[] fillValArr = new int[6];
        int value = 20;

        Arrays.fill(fillValArr, value); // fill take only 1 certain value
        for (int i : fillValArr) {
            System.out.println(i);
        }

        // Write a Java program to compare two arrays for equality.
        int[] equalArr1 = { 10, 20, 30, 40 };
        int[] equalArr2 = { 10, 20, 50, 40 };

        boolean areEqual = Arrays.equals(equalArr1, equalArr2);
        System.out.println(areEqual);

        // Memory reference to array.
        System.out.println(equalArr1);

        // toString method to print array values as string values
        System.out.println(Arrays.toString(sarr));

        // Converting string to array
        String singleName = "Test String Here !";
        System.out.println(singleName.toCharArray());

        // ArrayList for String
        ArrayList<String> nameOfArrList1 = new ArrayList<>(); // <> Diamond operator
        nameOfArrList1.add("Minakshee");
        nameOfArrList1.add("Bari");
        nameOfArrList1.add("Jalgaon");
        nameOfArrList1.add("Maharashtra");
        nameOfArrList1.add("India");
        System.out.println(nameOfArrList1);

        //Accessing element
        String lastEle = nameOfArrList1.get(4);
        System.out.println("Last element is: " + lastEle);

        //Check element is present or not
        boolean isPresent = nameOfArrList1.contains("Jalgaon");
        System.out.println("Contains Jalgaon? " + isPresent);

        //remove element using index
        nameOfArrList1.remove(2);
        System.out.println(nameOfArrList1);

        //remove element using value
        boolean removeEle = nameOfArrList1.remove("India");
        System.out.println("Is India removed: " + removeEle);
        
        //Updating element at specific index
        nameOfArrList1.set(1, "Minu");
        System.out.println(nameOfArrList1);

        //ArrayList size
        int len = nameOfArrList1.size();
        System.out.println("Lengh of the arrList: " + len);

        //is ArrayList is empty?
        boolean isEmpty = nameOfArrList1.isEmpty();
        System.out.println("Is list Empty?: " + isEmpty);

        //finding index of element
        int eleIndex = nameOfArrList1.indexOf("Maharashtra");
        System.out.println("Element present at: " + eleIndex);

        //check if two arrayList are eual or not?
        ArrayList<String> namArrayList2 = new ArrayList<>();
        namArrayList2.add("Madhu");
        namArrayList2.add("Jalgaon");
        namArrayList2.add("Mahabal");
        System.out.println(namArrayList2);
        
        boolean isArrEqual = nameOfArrList1.equals(namArrayList2);
        System.out.println("Are arrays equal? " + isArrEqual);

        //creating a sublist
        List<String> sublist = namArrayList2.subList(1, 3);
        System.out.println("sublist: " + sublist);

        //creating new arrayList from subList
        ArrayList<String> newList = new ArrayList<>(sublist);
        System.out.println("New List is: " + newList);

        //Converting arrayList to array
        String[] convertedArray = newList.toArray(new String[0]);
        System.out.println("NewList Converted to Array: " + Arrays.toString(convertedArray));

        //Reversing arrayList
        Collections.reverse(nameOfArrList1);
        System.out.println("Reversed List is: " + nameOfArrList1);

        //Shuffling arrayList elements
        Collections.shuffle(nameOfArrList1);
        System.out.println(nameOfArrList1);

        System.out.println("======++++++=====+++=======++++=======");
        // ArrayList for integer & Sorting of array
        ArrayList<Integer> numberSort = new ArrayList<>();
        //int will give error so that using Integer because it is a wrapper class.
        numberSort.add(50);
        numberSort.add(45);
        numberSort.add(56);
        numberSort.add(37);

        //print original list
        System.out.println("Original list is: " + numberSort);

        //sort list in Ascending order
        Collections.sort(numberSort);
        System.out.println("Ascending list is: " + numberSort);

        //sort list in descending order
        Collections.sort(numberSort, Collections.reverseOrder());
        System.out.println("Descending list is: " + numberSort);
    }
}
