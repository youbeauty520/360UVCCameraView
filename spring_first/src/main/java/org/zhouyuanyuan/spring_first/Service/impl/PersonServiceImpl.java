package org.zhouyuanyuan.spring_first.Service.impl;

import org.zhouyuanyuan.spring_first.Controller.XmlParserUtils;
import org.zhouyuanyuan.spring_first.Dao.Impl.PersonDaoImpl;
import org.zhouyuanyuan.spring_first.Dao.PersonDao;
import org.zhouyuanyuan.spring_first.Service.PersonService;
import org.zhouyuanyuan.spring_first.prjo.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonDao personDao = new PersonDaoImpl();

    @Override
    public List<Person> findAllPersons() {
        List<Person> personList = personDao.findAllPersons();
        personList.stream().forEach(person -> {
            String gender = person.getGender();
            if (gender.equals("1")) {
                person.setGender("男");
            } else if (gender.equals("2")) {
                person.setGender("女");
            }
            String job = person.getJob();
            if (job.equals("1")) {
                person.setJob("讲师");
            } else if (job.equals("2")) {
                person.setJob("主任");
            } else if (job.equals("3")) {
                person.setJob("院长");
            }
        });//转换为流再foreach
        return personList;
    }
}
