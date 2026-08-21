/**
 * fileWriter
 */
//imported class for this operation
import java.io.FileWriter;
import java.io.IOException;



public class fileWriter {

    public static void main(String[] args) {
        
        // we can even decide the location of the file through addig it's path
        String FilePath = "F:\\text.txt";
        try (FileWriter writter = new FileWriter(FilePath)){
            
            writter.write("Helloo this ist the first file that I'm writing thruough java \n  this is the second line and I am rewritting this in a different location ");
            System.out.println("FIle hass been written");



        }catch(IOException e){
            System.out.println("couldn't write the file ");
        }
    }
    
}