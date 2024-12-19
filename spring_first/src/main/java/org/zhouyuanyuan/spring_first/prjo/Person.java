package org.zhouyuanyuan.spring_first.prjo;

import lombok.Data;

@Data//setget构造器
public class Person {
    private String name;
    private Integer age;
    private String image;
    private String gender;
    private String job;

    public Person(String name, Integer age, String image, String gender, String job) {
        this.name = name;
        this.age = age;
        this.image = image;
        this.gender = gender;
        this.job = job;
    }
}
