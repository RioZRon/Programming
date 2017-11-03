package Stream.Ex.Four.序列化反序列化;

import java.io.*;

/**
 * @Describe:
 * @Date: 2017/10/26
 * @Modifiedby:
 */
public class StudentTestII {
    private File file;
    public void setFile(String atr) {
        file = new File(atr);
    }
    public File getFile() {

        return file;
    }
/**
* @Description:  create new File
* @param:file  File
* @return:void
**/
    public void CreatFile(File file){
        if(file.exists())
            file.delete();
        try{
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void WriteFile(File file,Employee employee){
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            try {
                objectOutputStream.writeObject(employee);
            }
            finally {
                objectOutputStream.flush();
                objectOutputStream.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public Employee ReaderFile(File file) {
        Employee employee = new Employee();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            try{
                employee  = (Employee)objectInputStream.readObject();
            }finally {
                objectInputStream.close();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return employee;

    }

    public static void main(String[] args){
        Employee employee = new Employee("Rio",19,10);
        StudentTestII stu = new StudentTestII();
        stu.setFile("/Users/riosysm/ReadSpace/Proguranmming/Java/SRC/src/Stream/Ex/Four/序列化反序列化/Test.txt");
        stu.CreatFile(stu.getFile());
        stu.WriteFile(stu.getFile(),employee);
        Employee employee1 = stu.ReaderFile(stu.getFile());
        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getSalary());
    }
}
