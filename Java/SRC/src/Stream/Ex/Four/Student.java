package Stream.Ex.Four;

import java.util.Date;

/**
 * @Describe:
 * @Date: 2017/10/26
 * @Modifiedby:
 */
public class Student {
    private int id;
    private String name;
    private Date birth;

    Student(int id, String name, Date birth){
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "id: " + id + " \nname: " + name + " \nbirth: " + birth;
    }
}
