public class loopsPractice {
    public static void main(String[] args) {
        int a=5, b=10;
        System.out.println(a>3 || b<3);

        
        int num = 0;
        int count = 1;
        do {
            System.out.println("Do While Num is: " + num);
            count++;
        } while (count < 6);

        int index = 1;
        while (index < 6) {
            System.out.println("while num: " + num);
            index++;
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(num + " | ");
            }
            System.out.println();
        }
        byte num1 = 127;
        num1++;
        System.out.println(++num1);
        System.out.println("Multiple of 23 are: ");
        // first five multiple of 23
        for (int i = 1; i <= 5; i++) {
            int mul = 23 * i;
            System.out.println(mul);
        }
        System.out.println("==========================");
        // print the sum of multiple of 5,7,& 9 and the sum should not exceed 100.
        // use single loop, you can declare multiple variables but condition must be
        // single

        for (int i = 1, j = 1, k = 1; (i + j + k < 100); i += 5, j += 7, k += 9) {
            System.out.println(i + j + k);
        }

        System.out.println("==========================");
        // WAP to print 17 13 9 5 1

        for (int i = 17; i >= 1; i -= 4) {
            System.out.print(i + "\t");
        }

        // while loop - when you have no idea about no of iterations required
        System.out.println("\n" + "==========================");
        int i = 1;
        while (i <= 5) {
            System.out.println(23 * i);
            i++;
        }
    }
}
