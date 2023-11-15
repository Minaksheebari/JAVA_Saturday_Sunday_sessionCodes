import java.util.Scanner;

public class libraryAppUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char returnToMainMenu;

        do {
            System.out.println("\n1. Return a Book\n2. Exit\n");
            System.out.print("Please choose an option from the above menu: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    returnBook();
                    break;
                case 2:
                    System.out.println("\nThank you for visiting SmartPoint!");
                    return;
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }

            System.out.print("\nEnter 'Y' to return to the main menu or 'N' to Exit: ");
            returnToMainMenu = scanner.next().charAt(0);

        } while (returnToMainMenu == 'Y' || returnToMainMenu == 'y');

        System.out.println("\nThank you for visiting SmartPoint!");
    }

    public static void returnBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "\n-----------------------------------------------------------------------------------------------------");
        System.out.println("\nReturn the Book\n");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");

        System.out.print("\nEnter the Book ID: ");
        int bookId = scanner.nextInt();

        // Simulating book details retrieval from a database or storage
        String bookDetails = getBookDetails(bookId);

        if (bookDetails != null) {
            System.out.println("\n" + bookDetails);

            System.out.print("\nEnter 'R' to confirm the return: ");
            char confirmReturn = scanner.next().charAt(0);

            if (confirmReturn == 'R' || confirmReturn == 'r') {
                System.out.println("\nBookID: " + bookId + " is returned back");
            } else {
                System.out.println("\nReturn process canceled");
            }
        } else {
            System.out.println("\nBook not found with ID: " + bookId);
        }
    }

    public static String getBookDetails(int bookId) {

        switch (bookId) {
            case 101:
                return "101 - Java Programming by John Smith\nStudentID - EC1234\nIssue Date - 10-May-2023\nDelayed by - 2 days\nDelayed Charges - Rs. 20.00";
            case 102:
                return "102 - Data Structures and Algorithms by Alice Johnson\nStudentID - EC5678\nIssue Date - 15-May-2023\nDelayed by - 3 days\nDelayed Charges - Rs. 30.00";
            case 103:
                return "103 - Artificial Intelligence by Robert Davis\nStudentID - EC9101\nIssue Date - 20-May-2023\nNot Delayed";
            default:
                return null;
        }
    }
}
