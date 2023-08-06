import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class libraryAppUsingFile {

    public static Scanner sc = new Scanner(System.in);
    public static String filename = "booklist.csv";
    public static String bookId = "0";
    public static char flag = 'Y';

    public static void main(String[] args) {

        while (flag == 'Y' || flag == 'y') {
            // add menu list
            System.out.println(
                    "*******************************************************\r\n" +
                            "<-----------@@Welcome to the Unique Library@@---------->\r\n" +
                            "*******************************************************\r\n" +
                            "1.View the complete list of Books\n" +
                            "----------------------------------\n" +
                            "2.Issue a Book\r\n" +
                            "----------------\n" +
                            "3.Return a Book\r\n" +
                            "----------------\n" +
                            "4.Exit\r\n" +
                            "--------");
            System.out.println("Please choose an option from the above menu: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    displayAllBooksList(filename);
                    break;
                case 2:
                    System.out.print("Enter book ID: ");
                    bookId = sc.next();
                    issueBook(bookId);
                    break;
                case 3:

                    break;
                case 4:
                    flag = 'N';
                    break;
                default:
                    break;
            }
        }
        if(flag == 'N' || flag == 'n'){
                        System.out.println("Thank you for visiting  SmartPoint!");
                    }
    }

    public static void displayAllBooksList(String filename) {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            br.readLine();
            System.out.println("*********************************************");
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                System.out.println("Book ID      : " + arr[0]);
                System.out.println("Book Title   : " + arr[1]);
                System.out.println("Author       : " + arr[2]);
                System.out.println("Availability : " + arr[3]);
                System.out.println("Issue Date   : " + arr[4]);
                System.out.println("*********************************************");
            }
            br.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Enter Y to return to the main menu or N to Exit:");
        flag = sc.next().charAt(0);
    }

    public static void issueBook(String bookId) {
        boolean bookAvail = false;
        String studID;
        char confirm;
        String newData = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");

                if (arr[0].equals(bookId) && arr[3].equals("Available")) {
                    System.out.println(line);
                    bookAvail = true;

                    System.out.println("Enter student ID: ");
                    studID = sc.next();

                    System.out.println("Enter C to confirm: ");
                    confirm = sc.next().charAt(0);

                    // Book ID,Book Title,Author,Availability,Issue Date
                    if (confirm == 'C' || confirm == 'c') {

                        newData += System.lineSeparator() + bookId + "," + arr[1] + "," + arr[2] + "," + studID + ","
                                + LocalDate.now();
                        System.out.println("BookID: " + bookId + " is issued to " + studID);
                    }
                } else {
                    newData += System.lineSeparator() + line;
                }
            }
            FileWriter fw = new FileWriter(filename);
            fw.write("Book ID,Book Title,Author,Availability,Issue Date");
            fw.write(newData);

            fw.close();
            System.out.println(newData);
            if (bookAvail == false) {
                System.out.println("Book not available");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Enter Y to return to the main menu or N to Exit:");
        flag = sc.next().charAt(0);
    }
}
