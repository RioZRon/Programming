package File;

import java.io.File;
import java.io.IOException;

/**
 * Created by riosysm on 2017/10/25.
 */
public class constractor {
    public static void main(String[] args) {
        File file22 = new File("src/Calendar");
        File file = new File ("src/Calendar/.txt");

        try{
            file.createNewFile();
            File.createTempFile("rio",".org", file22);
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }
}
