package org.zhouyuanyuan.spring_first.prjo;

import lombok.Data;

@Data//setget构造器
public class Employee {
    private String name;
    private Integer age;
    private String gender;
    private String job;

    public Employee(String name, Integer age, String gender, String job) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }
}
