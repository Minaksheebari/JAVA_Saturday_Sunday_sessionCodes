public class SortingArray {
    public static void main(String[] args) {
        int[] numArray = {4,2,6,3,5,1};
        
        System.out.println("Before Sorting: ");
        for(int i=0;i<numArray.length;i++){
            System.out.print(numArray[i] + " ");
        }

        for(int i=0;i<numArray.length;i++){
            for(int j=i;j<numArray.length;j++){
                if(numArray[i]>numArray[j]){
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }

        System.out.println("After Sorting: ");
        for(int i=0;i<numArray.length;i++){
            System.out.print(numArray[i] + " ");
        }
    }
}
