package File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by riosysm on 2017/10/25.
 */
public class Fileread {
    public static void main(String[] args){
        try {
            File readme = new File("src/Calendar/Readme.md");
            System.out.print(readme.exists());
            FileReader fileReader = new FileReader(readme);
            char[] chs= new char [1000];
            int ch = fileReader.read(chs);
            while(ch != -1){
                //System.out.print((char)ch);
                ch = fileReader.read(chs);
            }
            System.out.println(chs);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
