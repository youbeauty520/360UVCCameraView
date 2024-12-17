package org.zhouyuanyuan;

import lombok.Getter;
import lombok.Setter;

public class Dog {
    @Getter @Setter
    private String name;
    private int age;
    @Getter @Setter
    private int weight;
    @Getter @Setter
    private String type;

    @Override
    public String toString() {
        return "Dog:" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '.';
    }
}
