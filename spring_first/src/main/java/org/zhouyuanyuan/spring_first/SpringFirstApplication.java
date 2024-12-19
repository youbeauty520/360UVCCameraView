package org.zhouyuanyuan.spring_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zhouyuanyuan.spring_first.Controller.HelloController;

@SpringBootApplication
public class SpringFirstApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringFirstApplication.class, args);
        HelloController helloController = new HelloController();
        System.out.println(helloController.hello());
    }
}
