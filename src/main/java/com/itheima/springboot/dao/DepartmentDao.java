package com.itheima.springboot.dao;

import com.itheima.springboot.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao {

    List<Department> getDepratments();

    Department getDepartmentById(Integer id);

}

