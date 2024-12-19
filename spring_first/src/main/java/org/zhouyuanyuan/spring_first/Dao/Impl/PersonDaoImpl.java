package org.zhouyuanyuan.spring_first.Dao.Impl;

import org.zhouyuanyuan.spring_first.Controller.XmlParserUtils;
import org.zhouyuanyuan.spring_first.Dao.PersonDao;
import org.zhouyuanyuan.spring_first.prjo.Person;

import java.util.List;
//获取所有员工
public class PersonDaoImpl implements PersonDao {
    @Override
    public List<Person> findAllPersons() {//得到全部数据
        String file = this.getClass().getClassLoader().getResource("Person.xml").getFile();
        List<Person> personList = XmlParserUtils.parse(file, Person.class);
        return personList;
    }
    @Override
    public Person findPersonById(int id) {
        return null;
    }
}
