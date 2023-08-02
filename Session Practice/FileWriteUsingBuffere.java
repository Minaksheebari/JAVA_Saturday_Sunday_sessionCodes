import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingBuffere {
    
    public static void main(String[] args) {
        
        //Use bufferedWriter for writing a file
        try {
            String f1 = "SampleWriteFile.csv"; 
            //boolean flag=false;  
            BufferedWriter bw = new BufferedWriter(new FileWriter(f1, true)); //you just have to write true, it will automatically show fixed values.
            
            File f = new File(f1); //here we are creating a reference of f1 viz. actually a String holding fileName only, to get length of file
            if(f.length()==0){
                // If file is empty then only it will add header. 
                bw.newLine();
                bw.write("Name,Age,TotalMarks,Class");
            }

            //Rather than using file class you can set a flag
            // if(!flag){
            //     bw.newLine();
            //     bw.write("Name,Age,TotalMarks,Class");
            //     flag=true;
            //In this the problem is that, it will call flag again and again and header will print.
            // }

            bw.newLine();
            bw.write("Minakshee,27,500,FSD");
            bw.newLine();
            bw.write("Rajlakshmi,25,550,DS");
            bw.newLine();
            bw.write("Rakesh,29,450,DevOps");
            bw.newLine();
            bw.write("Sandesh,28,350,FSD");
            bw.newLine();
            bw.write("Shubham,32,250,HR");
            bw.newLine();

        bw.close();
        }catch (IOException e) {
            //Auto-generated catch block
            e.printStackTrace();
            System.out.println(e);
        }
        
    }
}
