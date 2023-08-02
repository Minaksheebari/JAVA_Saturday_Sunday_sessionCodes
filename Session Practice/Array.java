public class Array {
    public static void main(String[] args) {
        // Array is a collection of similar data type
        /*You must know the size before creating array, Once you create an array you can 
        not add more data, you can delete existing value and then only able to add, but can not increase the size.*/

        String[] studName = {"Minu","Vaibhav","Urvashi"};

        System.out.println("Array Before: ");
        for(int i=0; i<studName.length; i++){  
            System.out.println(studName[i]);
        }

        System.out.println("======================= ");
        System.out.println("Array After: ");
        studName[0] = "Minakshee";
        for(int i=0; i<studName.length; i++){
            System.out.println(studName[i]);
        }
    }
}
