import java.util.Scanner;

public class libraryAppUsingArray {
    static class Book {
        int id;
        String title;
        String author;
        String studentId;
        String issueDate;
        int delayedDays;
        double delayedCharges;

        Book(int id, String title, String author, String studentId, String issueDate, int delayedDays,
                double delayedCharges) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.studentId = studentId;
            this.issueDate = issueDate;
            this.delayedDays = delayedDays;
            this.delayedCharges = delayedCharges;
        }
    }

    static Book[] books = {
            new Book(101, "Java Programming", "John Smith", "EC1234", "10-May-2023", 2, 20.00),
            new Book(102, "Data Structures and Algorithms", "Alice Johnson", "EC5678", "15-May-2023", 3, 30.00),
            new Book(103, "Artificial Intelligence", "Robert Davis", "EC9101", "20-May-2023", 0, 0.00)
    };

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

        // Simulating book details retrieval from the array
        Book book = getBookDetails(bookId);

        if (book != null) {
            System.out.println("\n" + bookDetailsToString(book));

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

    public static Book getBookDetails(int bookId) {
        for (Book book : books) {
            if (book.id == bookId) {
                return book;
            }
        }
        return null;
    }

    public static String bookDetailsToString(Book book) {
        return book.id + " - " + book.title + " by " + book.author + "\n" +
                "StudentID - " + book.studentId + "\n" +
                "Issue Date - " + book.issueDate + "\n" +
                (book.delayedDays > 0
                        ? "Delayed by - " + book.delayedDays + " days\nDelayed Charges - Rs. " + book.delayedCharges
                        : "Not Delayed");
    }
}
