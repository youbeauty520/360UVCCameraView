package org.zhouyuanyuan.spring_first.prjo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int age;
    @Getter
    @Setter
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
