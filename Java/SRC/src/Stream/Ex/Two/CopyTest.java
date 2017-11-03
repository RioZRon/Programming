package Stream.Ex.Two;

import java.io.*;
import java.net.URLDecoder;

/**
 * @Describe: 实现文件的复制功能
 * @Date: 2017/10/25
 * @Modifiedby:
 */
public class CopyTest {
    public static void main(String[] args){
        File file1 = new File("/Users/riosysm/ReadSpace/Proguranmming/Java/SRC/src/Stream/Ex/Two/copysrc.doc");
        File file2 = new File("/Users/riosysm/ReadSpace/Proguranmming/Java/SRC/src/Stream/Ex/Two/copydes.doc");
        new CopyTest().Copy(file1,file2);
    }

    public void Copy(File file1, File file2){
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file1),"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer = new StringBuffer();
            try {
                String str = bufferedReader.readLine();
                while (str != null) {
                    stringBuffer.append(str);
                    str = bufferedReader.readLine();
                    // System.out.println(stringBuffer);
                }
            }finally {
                inputStreamReader.close();
                bufferedReader.close();
            }
                // OutputStreamWriter outputStreamWriter= new OutputStreamWriter(new FileOutputStream(file2));
            PrintWriter printWriter = new PrintWriter(file2.getPath(), "UTF-8");
            try{
                printWriter.write(stringBuffer.toString());
            }finally {
                printWriter.flush();
                printWriter.close();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
