package com.itheima.springboot.dao;

import com.itheima.springboot.pojo.Department;

import java.util.Collection;

public interface DepartmentDao {
    Collection<Department> getDepratments();
    Department getDepartmentById(Integer id);

}

