package org.zhouyuanyuan.spring_first.Dao.Impl;

import org.zhouyuanyuan.spring_first.Dao.PersonDao;
import org.zhouyuanyuan.spring_first.prjo.Person;

import java.util.List;

public class StudentDaoImpl implements PersonDao {
    @Override
    public List<Person> findAllPersons() {
        return List.of();
    }

    @Override
    public Person findPersonById(int id) {
        return null;
    }
}