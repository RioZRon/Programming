package Collections.listiterator;


import java.util.*;
import java.util.jar.Pack200;

/**
 * Created by riosysm on 2017/10/23.
 */
public class ListiteratorTest {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for(int i=0; i< 10; i++)
//            arrayList.add(i);
//
//        ListIterator listiter = arrayList.listIterator(10);
//       while (listiter.hasPrevious())
//        System.out.print(listiter.previous());
//
//
//        System.out.println();
//        ListIterator<Integer> listGO = arrayList.listIterator();
//        while(listGO.hasNext())
//            System.out.print(listGO.next());


        Comparator<Student> byage = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        };

        ArrayList<Student> studentList = new ArrayList<Student>();
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            ListiteratorTest.Student temp = new ListiteratorTest.Student();
            //System.out.println(i);
            System.out.print("enter your name:");
            if (in.hasNextLine()) {
                temp.name = in.nextLine();
            }
            System.out.print("enter your age:");
            if (in.hasNextInt())
                temp.age = in.nextInt();
            System.out.print("enter your sorce:");
            if (in.hasNextDouble())
                temp.sorce = in.nextDouble();

            if (in.hasNextLine()) {
                in.nextLine();
            }

            System.out.println(temp.toString());
            studentList.add(temp);
        }

        // Comparator<Student> byage = Comparator.comparing(Student::getAge);
        // Comparator<Student> byStu = studentList.
         studentList.sort(byage);

        for (Student temp : studentList)
            System.out.println(temp.toString());
    }

    static class Student  {
        private String name;
        private int age;
        private double sorce;

        public Student() {
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Name: " + name + "\n age: " + age + "\n sorce:" + sorce;
        }



//        @Override
//        public int compareTo(Object o){
//            try {
//                if (o.getClass() == this.getClass()) {
//                    Student other = (Student) o;
//                    return age - other.age;
//                }
//                else
//                    throw NotSameClassExcption;
//            }
//            catch (NotSameClassExcption e) {
//                e.printStackTrace();
//            }
//            if (o.getClass() == this.getClass()) {
//                    Student other = (Student) o;
//                    return age - other.age;
//                }
//            return 0;
//        }


            //        @Override
//        public int compare(Object o1, Object o2) {
//            return (int)o2 - (int)o1;
            //      }
        }

    }

    class NotSameClassExcption extends Exception {
        public NotSameClassExcption() {
        }

        public NotSameClassExcption(String msg) {
            super(msg);
        }
    }


