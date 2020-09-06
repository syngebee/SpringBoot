package com.itheima.springboot.service;

import com.itheima.springboot.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getEmployeeById(Integer id);

    List<Employee> getAll();

    void add(Employee employee);

    void remove(Integer id);
}
