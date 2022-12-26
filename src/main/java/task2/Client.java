package task2;

import lombok.Getter;

@Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private static int count = 0;


    public Client(String name, int age, Gender sex) {
        this.id = ++count;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
