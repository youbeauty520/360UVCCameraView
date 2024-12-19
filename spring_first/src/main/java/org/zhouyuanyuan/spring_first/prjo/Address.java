package org.zhouyuanyuan.spring_first.prjo;

import lombok.Getter;
import lombok.Setter;

//地址实体类
public class Address {
    @Getter
    @Setter
    private String province;
    @Getter
    @Setter
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
