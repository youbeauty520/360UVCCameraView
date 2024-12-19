package org.zhouyuanyuan.spring_first.Service;

import org.zhouyuanyuan.spring_first.prjo.Person;

import java.util.List;
//获取所有的员工
public interface PersonService {
    List<Person> findAllPersons();
}
