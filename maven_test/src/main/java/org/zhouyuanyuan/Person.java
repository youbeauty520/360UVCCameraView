package org.zhouyuanyuan;

import lombok.Getter;
import lombok.Setter;

public class Person {
    @Getter @Setter
    private String name;
    @Getter @Setter//自动补全我们的git和set方法
    private int age;
    @Getter @Setter
    private String city;

   /* public String getName() {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
