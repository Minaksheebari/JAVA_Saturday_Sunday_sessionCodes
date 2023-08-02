public class nestedLoop {
    public static void main(String[] args) {
        // printing numbers & stats Pattern

        System.out.println("========First========");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*"); // or just print j for 12345...
            }
            System.out.println();
        }

        // print same in reverse order
        System.out.println("========Second========");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // you can print start as well
            }
            System.out.println();
        }

        System.out.println("========Third========");
        // print given Pattern
        // 5432*
        // 543*1
        // 54*21
        // 5*321
        // *4321

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
