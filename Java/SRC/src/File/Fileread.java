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
        System.out.println(System.getProperties());
        try {
            FileReader fileReader = new FileReader("src/Calendar/Test.txt");
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
