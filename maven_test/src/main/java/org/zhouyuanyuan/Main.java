package org.zhouyuanyuan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person zhangsan = new Person();
        zhangsan.setName("张三");//可以用@Getter 和Setter
        zhangsan.setCity("孝感");
        zhangsan.setAge(18);
        System.out.println(zhangsan.toString());
        Dog dog1=new Dog();
        dog1.setName("");
    }
}