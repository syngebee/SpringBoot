package com.itheima.springboot.dao;

import com.itheima.springboot.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {

    List<Employee> getAll();

    void save(Employee employee);

    Employee getEmployeeById(Integer id);

    void remove(Integer id);

    void update(Employee employee);
}
