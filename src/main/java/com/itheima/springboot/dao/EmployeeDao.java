package com.itheima.springboot.dao;

import com.itheima.springboot.pojo.Employee;

import java.util.Collection;

public interface EmployeeDao {

    Collection<Employee> getAll();

    void save(Employee employee);

    void delete(Integer id);

    Employee getEmployeeById(Integer id);

    void remove(Integer id);
}
