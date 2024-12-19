package org.zhouyuanyuan.spring_first.Dao;

import org.zhouyuanyuan.spring_first.prjo.Person;

import java.util.List;

public interface PersonDao {
    public List<Person> findAllPersons();//访问”数据库"获取数据库里面所有的Person
    public Person findPersonById(int id);
}
