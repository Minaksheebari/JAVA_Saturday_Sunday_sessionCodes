import java.io.BufferedReader;
import java.io.FileReader;

public class csvFileRead {
    public static void main(String[] args) {
        // Task 1: Reading CSV file using buffer reader.
                System.out.println("==========CSV File Using Buffer Reader===========");
        try{
            BufferedReader br = new BufferedReader(new FileReader("details.csv"));  //you can check by sample.txt as well.
            String line;
            int sum = 0;
            br.readLine();  // read from line no. 2 cursor will shift to 2nd line
            while((line=br.readLine()) != null){
                //System.out.println(line);
                // String[] data = line.split(",");
                // String n = data[0];
                // System.out.println(n);

                String[] a = line.split(",");
                String age = a[1];
                int age1 = Integer.parseInt(age);
                sum = sum+age1;
            }
            System.out.println("Sum is: " + sum);
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();    
        } 
    }
}
