package Stream.Ex.Four.序列化反序列化;

import java.io.Serializable;

/**
 * @Describe:
 * @Date: 2017/10/26
 * @Modifiedby:
 */
public class Employee implements Serializable {
    private String name;
    private int age;
    private transient double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
