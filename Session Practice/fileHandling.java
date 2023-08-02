//  1. Buffer reader will read line by line. Use for larde files. readLine()
// 2. issue in buffering - it require additional parsing to cinvert the data
// 3. It returns data in string. 
// Use try catch block
//1. Scanner - used when handling different types of data i.e. structured data files 
// eg. - string, int, float, double InterruptedException
//2. issue = it is slower due to multiple data types takes time for parsing

//1. File input stream = read raw data as binary data 
//2. it return - string array list

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        // Task 1: Reading file using buffer reader.
        System.out.println("==========Using Buffer Reader===========");
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt")); // you can check by details.csv as
                                                                                  // well.
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("==========Using Scnner===========");
        //// Task 2: Create file using Scanner class.
        try {
            Scanner sc = new Scanner(new File("sample.txt"));
            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);
            }
        } catch (FileNotFoundException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("==========Using File Reader===========");
        //// Task 3: Create file using File Reader class.

        try {
            FileReader fr = new FileReader("sample.txt");
            int i;
            try {
                while ((i = fr.read()) != -1) {
                    // System.out.println(i); // it will give output as integer numbers
                    System.out.print((char) i);
                }
                fr.close();
            } catch (IOException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }
}
