package com.itheima.springboot.service.impl;

import com.itheima.springboot.dao.DepartmentDao;
import com.itheima.springboot.pojo.Department;
import com.itheima.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    @Override
    public List<Department> getDepartments() {
        List<Department> depratments = departmentDao.getDepratments();
        return new ArrayList<>(depratments);
    }
}
