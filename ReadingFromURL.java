import java.net.*;
import java.io.*;

/**
 * ReadingFromURL
 */
public class ReadingFromURL {

    public static void main(String[] args) throws Exception{

        String message = URLEncoder.encode("REQUEST CONFIRMED", "UTF-8");

        URL url = new URL("http://httpbin.org/anything/{anything}");

        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        
        connection.setRequestProperty("Accept", "application/json");

        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
        out.write(message);
        out.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String rMessage;
        while((rMessage = in.readLine())!= null)
            System.out.println(rMessage);

        in.close();
    };       
}