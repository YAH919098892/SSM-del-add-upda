package com.service;

import com.pojo.Tbstudent;

import java.util.List;

public interface TbstudentService {

    //增加
    int addStudent(Tbstudent tbstudent);
    //删除
    int delectStudentByNo(String no) ;
    //修改
    int updateStudent(Tbstudent tbstudent);

    //查询
    List<Tbstudent> selectStudent();

    Tbstudent selectStudentOne(String on);
}
