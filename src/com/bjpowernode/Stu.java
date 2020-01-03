package com.bjpowernode;

/**
 * 动力节点 王玉柱
 * 2020/1/3
 */
public class Stu {
    private String id;
    private String name;
    private String age;
    private String addr;
    private String master;
    private String bran02;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", addr='" + addr + '\'' +
                ", master='" + master + '\'' +
                ", bran02='" + bran02 + '\'' +
                '}';
    }
}
