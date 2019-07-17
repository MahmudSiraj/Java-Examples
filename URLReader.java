import java.io.*;
import java.net.*;


/**
 * URLReader
 */
public class URLReader {
    public static void main(String[] args) throws Exception{
        URL oracleTutorial = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracleTutorial.openStream()));

        String inputLine;
        while((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}