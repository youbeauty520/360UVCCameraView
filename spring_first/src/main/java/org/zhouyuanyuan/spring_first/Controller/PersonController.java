package org.zhouyuanyuan.spring_first.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhouyuanyuan.spring_first.Service.PersonService;
import org.zhouyuanyuan.spring_first.Service.impl.PersonServiceImpl;
import org.zhouyuanyuan.spring_first.prjo.Person;
import org.zhouyuanyuan.spring_first.prjo.Result;

import javax.management.modelmbean.XMLParseException;
import java.util.List;

@RestController
public class PersonController {
    private PersonService personService= new PersonServiceImpl();
    @RequestMapping("/getAllPersons")
    public Result getAllPersons() {
        List<Person> personList = personService.findAllPersons();
        return Result.success(personList);
    }



//    @RequestMapping("/getPerson")
//    public Result getPerson() {
//        String file = this.getClass().getClassLoader().getResource("Person.xml").getFile();
//        List<Person> personList = XmlParserUtils.parse(file, Person.class);
//        personList.stream().forEach(person -> {
//            String gender = person.getGender();
//            if (gender.equals("1")) {
//                person.setGender("男");
//            } else if (gender.equals("2")) {
//                person.setGender("女");
//            }
//            String job = person.getJob();
//            if (job.equals("1")) {
//                person.setJob("讲师");
//            } else if (job.equals("2")) {
//                person.setJob("主任");
//            } else if (job.equals("3")) {
//                person.setJob("院长");
//            }
//        });//转换为流再foreach
//        return Result.success(personList);
//    }
}
