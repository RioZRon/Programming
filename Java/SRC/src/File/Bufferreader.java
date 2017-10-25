package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by riosysm on 2017/10/25.
 */
public class Bufferreader {
    public static void main(String[] args){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Calendar/Readme.md"));
            char[] chars= new char[1024];
            String str = null;
            do{
                str = bufferedReader.readLine();
                System.out.println(new String(str.getBytes(),"UTF-8"));
            } while(str  == null);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(System.getProperties());
    }
}
