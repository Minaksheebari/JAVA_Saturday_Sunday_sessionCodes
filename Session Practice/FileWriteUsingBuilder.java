//Moving entire data in one go rather than single line

import java.io.FileWriter;

public class FileWriteUsingBuilder {
    public static void main(String[] args) {
    
        StringBuilder sb = new StringBuilder();
        sb.append("This my string Builder Example").append(System.lineSeparator());
        sb.append("My name is Minu").append(System.lineSeparator());
        sb.append("I am in my FSD class").append(System.lineSeparator());
        
        try {
            FileWriter file = new FileWriter("StringBuilderFile.txt");
            file.write(sb.toString());
        
        file.close();
        } catch (Exception e) {
            // handle exception
            e.getMessage();
        }

       
    }
}
