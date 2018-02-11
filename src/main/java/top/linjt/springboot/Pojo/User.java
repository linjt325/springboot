package top.linjt.springboot.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author XxX
 * @date 2018/2/11 15:34
 */
@Entity()
public class User {

    public User() {
    }

    @Id
    @GeneratedValue
    private int id ;

    private String name;

    private int age ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
