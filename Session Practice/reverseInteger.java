// Reverse an integer given
public class reverseInteger {
    public static void main(String[] args) {
        //Run loop until the given number is 0
        int num=34562, reversed=0;
        System.out.println("Original number: " + num);
        while(num!=0){
            int digit = num%10;
            reversed=reversed*10 + digit;
            num/=10;
        }
        System.out.println("Original number: " + reversed);
    }
}
