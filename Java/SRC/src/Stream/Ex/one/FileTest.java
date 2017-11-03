package Stream.Ex.one;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Describe:列出目标文件夹的所有文件名和文件的路径
 * @Date: 2017/10/25
 * @Modifiedby:
 */
public class FileTest {
    public static void main(String[] args){
        File targetDirectorie = new File("/Users/riosysm/ReadSpace/Proguranmming/Java/SRC/src/Calendar");
        try{
            if (!targetDirectorie.exists())
                throw new FileNotFoundException();
            File[] filearray = new File[10];
            filearray  = targetDirectorie.listFiles();
            for(File file:filearray){
                System.out.println("FileName:  "+file.getName());
                System.out.println("Directorie:" +file.getPath());
                System.out.println("----------");
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException  e){
            e.printStackTrace();
        }


    }

}
