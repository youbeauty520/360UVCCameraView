package org.zhouyuanyuan.spring_first;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    public static void main(String[] args) {
        /*DataConfig dataconfig=new DataConfig();
        dataconfig.setUsername("root");
        dataconfig.setPassword("123456");
        dataconfig.setUrl("localhost:3306");
        dataconfig.setDatabase("MySQL");
        第一种*/

        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext("org.zhouyuanyuan");
        System.out.println(context.getBean(DataConfig.class));
    }
}
