import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MenudrivenAppFileHandle {
    public static void main(String[] args) {
        
    // Create a new folder
    // Create a new text file
    // Write into a text file 
    // Append data to a text file
    // Rename a file
    // Delete a File
        
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("\n =====Menu Driven Application=====");
            System.out.println("1.Create a new folder");
            System.out.println("2.Create a new text file");
            System.out.println("3.Write into a text file");
            System.out.println("4.Append data to a text file");
            System.out.println("5.Rename a file");
            System.out.println("6.Delete a File");
            System.out.println("7.Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createNewFolder(sc);
                    break;
                case 2:
                    createNewTextFile(sc);
                    break;
                case 3:
                    writeInTextFile(sc);
                    break;
                case 4:
                    appendInTextFile();
                    break;
                case 5:
                    renameFile();
                    break;
                case 6:
                    deleteFile();
                    break;
                case 7:
                    exit =true;
                    break;
                default:
                    System.out.println("Invalid Choice...!!");
            }
        }
    }

    public static void createNewFolder(Scanner sc){

        System.out.println("Please enter the Folder-name to be Created: ");
        String folderName = sc.nextLine();

        System.out.println("Please enter the Path where you wish to save a new folder: ");
        String folderPath = sc.nextLine();

        File fd = new File(folderPath, folderName);

        if(!fd.exists()){
            boolean folderCreated = fd.mkdirs();

            if(folderCreated){
                System.out.println("Folder Created successfully..!!");
            }else{
                System.out.println("Failed to create folder..!!");
            }
        }else{
            System.out.println("Folder already exists..!!");
        }
        sc.close();
    }
    public class TextFileCreator{
    public static void createTextFile(String filePath, String fileName,Scanner sc){
        File fd = new File(filePath);

        if(!fd.exists()){
            boolean folderCreated = fd.mkdirs();

            if(folderCreated){
                System.out.println("Folder Created successfully..!!");
            }else{
                System.out.println("Failed to create folder..!!");
            }
        }else{
            System.out.println("Folder already exists..!!");
        }

        File textFile = new File(fd.getAbsolutePath(), fileName);
        if(!textFile.exists()){
            try {
                boolean fileCreated = textFile.createNewFile();

                if(fileCreated){
                    System.out.println("Text file created successfully..!!");
                }else{
                    System.out.println("Failed to create text file..!!");
                }
            } catch (Exception e) {
                System.out.println("Error occured while creating text file " + e.getMessage());
            }
        }else{
                System.out.println("Text file exist already..!!");
            }
    }
}
    public static void createNewTextFile(Scanner sc){
        System.out.println("Please enter the file name to be Created: ");
        String fileName = sc.nextLine();

        System.out.println("Please enter the path where you want to add file: ");
        String folderPath = sc.nextLine();

        System.out.println("Please enter the folder name where you want to add file: ");
        String folderName = sc.nextLine();

        String filePath = folderPath + File.separator + folderName + File.separator + fileName;
        TextFileCreator.createTextFile(filePath,fileName,sc);        
    }

    public static void writeInTextFile(Scanner sc){
        System.out.println("Please enter the file name: ");
        String fileName = sc.nextLine();

        System.out.println("Please enter the path where your file is stored: ");
        String folderPath = sc.nextLine();

        System.out.println("Please enter the folder name where your file is stored: ");
        String folderName = sc.nextLine();

        File fd = new File(folderPath);

        if(!fd.exists()){
            boolean folderCreated = fd.mkdirs();

            if(folderCreated){
                System.out.println("Folder Created successfully..!!");
            }else{
                System.out.println("Failed to create folder..!!");
            }
        }else{
            System.out.println("Folder already exists..!!");
        }

        File textFile = new File(fd.getAbsolutePath(), fileName);

        try {
            boolean fileOpened = textFile.createNewFile();

            if(fileOpened){
                System.out.println("Text file opened successfully..!!");
                System.out.println("Write data into file: ");
                String writeData = sc.nextLine();
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
                    bw.write(writeData);
                    bw.newLine();
                    bw.close();
                    System.out.println("Data written successfully..!!");
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("An error occured while writing into file"+ e.getMessage());
                }
            }else{
                System.out.println("Failed to create text file..!!");
            }
        } catch (Exception e) {
            System.out.println("Error occured while creating text file " + e.getMessage());
        }

    }
    public static void appendInTextFile(){

    }

    public static void renameFile(){

    }

    public static void deleteFile(){

    }
}
