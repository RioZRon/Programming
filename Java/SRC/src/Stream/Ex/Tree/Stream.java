package Stream.Ex.Tree;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @Describe: 读入文件里的数据,把l改成L,写文件
 * @Date: 2017/10/26
 * @Modifiedby:
 */
public class Stream {

    private File fileFrom;
    private File fileTo;
    public void SetfileFrom(String str){
        fileFrom = new File(str);
    }
    public File getFileTo() {
        return fileTo;
    }
    public File getFileFrom() {

        return fileFrom;
    }
    public void SetfileTo(String str){
        fileTo = new File(str);
    }

    public void CreateFile(File filein){
        try {
            if (!filein.exists()) {
                filein.createNewFile();
                System.out.println("OK");
            }
            else {
                filein.delete();
                filein.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(filein.getPath(), "UTF-8");
            try {
                String str = "hello world";
                printWriter.write(str);
            } finally {
                printWriter.flush();
                printWriter.close();
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void WriteFile(String str, File file){
        try{
            PrintWriter printWriter = new PrintWriter(file, "UTF-8");
            try {
                printWriter.write(str);
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
    public String ReadFile(File file){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file),"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            try{
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
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            return stringBuffer.toString();
        }
    }
    public String Fliter(String str){
        str.replace('l', 'L');
        return str;
    }
    public static void main(String[] args){

        Stream streamTest = new Stream();
        String contents = new String();
        streamTest.SetfileFrom("/Users/riosysm/ReadSpace/Proguranmming/Java/SRC/src/Stream/Ex/Tree/test.txt");
        streamTest.CreateFile(streamTest.getFileFrom());
        contents = streamTest.ReadFile(streamTest.getFileFrom());
        streamTest.SetfileTo("/Users/riosysm/ReadSpace/Proguranmming/Java/SRC/src/Stream/Ex/Tree/to.txt");
        streamTest.CreateFile(streamTest.getFileTo());
        contents = streamTest.Fliter(contents);
        System.out.println(contents);
        streamTest.WriteFile(contents,streamTest.getFileTo());
    }
}
