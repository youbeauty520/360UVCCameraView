package org.zhouyuanyuan.spring_first;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
//控制反转
public class DataConfig {
    @Value("localhost:8080")//设置值
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;
    @Value("MySQL")
    private String database;
}
