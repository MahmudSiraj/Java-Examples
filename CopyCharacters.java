import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * CopyCharacters
 */
public class CopyCharacters {

    public static void main(String[] args) throws IOException{
        
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try{
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;

            while((l = inputStream.readLine()) != -1){
                outputStream.println(l);
            }
        } finally {
            if(inputStream != null) { inputStream.close();}
            if(outputStream != null) { outputStream.close();}
        }
    }
}