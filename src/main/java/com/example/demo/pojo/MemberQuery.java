package com.example.demo.pojo;

import lombok.Data;

@Data
public class MemberQuery {
    private Integer id;
    private String name;
    private String sex;
    private String department;
    private Integer salaryBegin;
    private Integer salaryEnd;
    private Integer ageBegin;
    private Integer ageEnd;

}
