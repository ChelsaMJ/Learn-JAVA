import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args) { 
        // How to write a file using Java (4 popular options)
        
        // Option 1: Using FileWriter with try-with-resources

        
        String filePath ="D:\\Learn JAVA\\output.txt";
        String textContent = """
        Roses are Red
        Violets are Blue
        BOOTY BOOTY BOOTY
        ROCKIN' EVERWHERE!
        
        """;


        try (FileWriter writer = new FileWriter(filePath)) { 
            writer.write(textContent); 
            
            System.out.println("File 'output.txt' has been written");
        } 
        catch(FileNotFoundException e){ // Catch if the specified directory path is invalid
            System.out.println("Could not locate file location");
        }
        catch (IOException e) { 
            System.out.println("Could not write file");
        }
}
}