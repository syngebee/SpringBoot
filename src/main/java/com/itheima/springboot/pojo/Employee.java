package com.itheima.springboot.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private String gender; //0是女,1是男

    private String departmentId;
    private String birth;
}
