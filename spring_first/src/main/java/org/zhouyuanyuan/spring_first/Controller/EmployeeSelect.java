package org.zhouyuanyuan.spring_first.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhouyuanyuan.spring_first.prjo.Employee;
import org.zhouyuanyuan.spring_first.prjo.Person;
import org.zhouyuanyuan.spring_first.prjo.Result;

import javax.management.modelmbean.XMLParseException;
import java.util.List;

@RestController
public class EmployeeSelect {
    @RequestMapping("/getEmployee")
    public Result getEmployee() {//
        String file = this.getClass().getClassLoader().getResource("Person.xml").getFile();
        List<Employee> personList = XmlParserUtils.parse(file, Employee.class);
        personList.stream().forEach(person -> {
            String gender = person.getGender();
            if (gender.equals("1")) {
                person.setGender("男");
            } else if (gender.equals("2")) {
                person.setGender("女");
            }
            String job = person.getJob();
            if (job.equals("1")) {
                person.setJob("外卖小哥");
            } else if (job.equals("2")) {
                person.setJob("皇帝");
            } else if (job.equals("3")) {
                person.setJob("歌手");
            }
        });//转换为流再foreach
        return Result.success(personList);
    }
}
