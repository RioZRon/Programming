package Stream.Ex.Four;

import sun.nio.ch.sctp.SctpNet;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Describe: 将类的信息放到一个文件里面 然后从文件里面读取
 * @Date: 2017/10/26
 * @Modifiedby:
 */
public class StudentTest {
    private File fileTo;
    public File getFileTo() {
        return fileTo;
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
    public String[] Fliter(String str){
        System.out.println("jkljk");
        String pattern = "(id\\b.\\s)(\\d)(\\sname.\\s)(\\D*)(\\sbirth.\\s)(.*)";
//        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
//
//        // 现在创建 matcher 对象
        Matcher m = r.matcher(str);
/*        if (m.find( )) {
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(4) );
            System.out.println("Found value: " + m.group(6) );
        } else {
            System.out.println("NO MATCH");
        }*/

//            System.out.println("Found value: " + m.group(2) );
//            System.out.println("Found value: " + m.group(4) );
//            System.out.println("Found value: " + m.group(6) );
            String [] strings = new String[3];
        if(m.find()) {
            strings[0] = m.group(2);
            strings[1] = m.group(4);
            strings[2] = m.group(6);
        }
        return strings;
    }


    public static void main(String[] args){
        Student student = new Student(1,"rio", new Date(1996,11,26));
        StudentTest studentTest = new StudentTest();
        studentTest.SetfileTo("/Users/riosysm/ReadSpace/Proguranmming/Java/SRC/src/Stream/Ex/Four/Test.txt");
        studentTest.CreateFile(studentTest.getFileTo());
        studentTest.WriteFile(student.toString(),studentTest.getFileTo());
        String studentStr = studentTest.ReadFile(studentTest.getFileTo());
        System.out.println(studentStr);
        String[] studentArry = studentTest.Fliter(studentStr);
        for(String str: studentArry){
            System.out.println(str);
        }
    }
}
