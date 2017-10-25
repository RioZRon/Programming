hiRioSysy mie就看到了发几块减肥的看贾风可大了解放路口 
package File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;

/**
 * Created by riosysm on 2017/10/25.
 */
public class Fileread {
    public static void main(String[] args){
        try {
            FileReader fileReader = new FileReader("/Users/riosysm/ReadSpace/Proguranmming/Java/ASCII.org");
            int ch = fileReader.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = fileReader.read();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
 
