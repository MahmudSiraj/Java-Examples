import java.io.*;
import java.util.Scanner;

/**
 * ScanXan
 */
public class ScanXan {

    public static void main(String[] args) throws IOException{
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
            s.useDelimiter(",\\s*");
            while(s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if(s != null) {
                s.close();
            }
        }
    }
}