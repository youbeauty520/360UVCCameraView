package org.zhouyuanyuan.spring_first.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.zhouyuanyuan.spring_first.prjo.Address;
import org.zhouyuanyuan.spring_first.prjo.Result;
import org.zhouyuanyuan.spring_first.prjo.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "hello world";
    }

    @RequestMapping("/helloTest")
    public Result helloTest() {
        System.out.println("hello world");
        return Result.success("hello world");

    }

    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request) {
        String name = "name"; // 获取字符串的代码
        if (name != null) {
            int number = Integer.parseInt(name);
            // 使用number进行后续操作
        } else {
        }
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(name + "," + age);
        return "原始servlet方式";
    }

    @RequestMapping("/springbootTest")
    public String springbootTest(String name, Integer age) {
        System.out.println(name + "和" + age);
        return "Spring Boot方式请求";
    }

    @RequestMapping("/entytest")
    public String Entytest(User user) {
        System.out.println(user);
        return "实体类请求";
    }

    @RequestMapping("/arrayTest")
    public String ArrayTest(String[] hobby) {
        System.out.println(Arrays.toString(hobby));//转化为字符串
        return "数组请求";
    }

    @RequestMapping("/listTest")
    public String listTest(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "集合请求";
    }

    @RequestMapping("/dataTest")
    public String dataTest(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime dateTime) {
        System.out.println(dateTime);
        return "时间请求";
    }

    @RequestMapping("/jsonTest")
    public String jsonTest(@RequestBody User user) {//传参统一用json格式//json一般用post
        System.out.println(user);
        return "json测试成功";
    }

    //上面响应的是市字符串
    @RequestMapping("/getAddress")
    public Address getAddress() {
        Address address = new Address();
        address.setProvince("湖北省");
        address.setCity("孝感市");
        return address;
        //缺点是我们添加多个时会需要new多个address对象
    }

    @RequestMapping("/getAddressList")
    public List<Address> getAddressList() {
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("湖北省");
        address1.setCity("武汉市");
        Address address2 = new Address();
        address2.setProvince("北京");
        address2.setCity("北京");
        Address address3 = new Address();
        address3.setProvince("广东省");
        address3.setCity("深圳");
        list.add(address1);
        list.add(address2);
        list.add(address3);
        return list;
    }

    @RequestMapping("/getAddressList2")
    public Result getAddressList2() {
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("湖北省");
        address1.setCity("武汉市");
        Address address2 = new Address();
        address2.setProvince("北京");
        address2.setCity("北京");
        Address address3 = new Address();
        address3.setProvince("广东省");
        address3.setCity("深圳");
        list.add(address1);
        list.add(address2);
        list.add(address3);
        return Result.success(list);
    }
}
