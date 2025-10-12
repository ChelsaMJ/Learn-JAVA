import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileRead {
    public static void main(String[] args) { 

        String filePath ="D:\\Learn JAVA\\output2.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            // read file line by line
            String line;

            while((line = reader.readLine()) != null){ // continue reading lines until null
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e) { 
            System.out.println("Could not write file");
        }

    }

}
