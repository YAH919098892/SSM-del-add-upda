package com.service;

import com.dao.TbstudentMapper;
import com.pojo.Tbstudent;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
public class TbstudentServiceImp implements TbstudentService {
    //service层调用dao层，组合dao
@Autowired
@Qualifier("tbstudentMapper")
    TbstudentMapper tbstudentMapper;
    @Override
    public int addStudent(Tbstudent tbstudent) {
       return tbstudentMapper.addStudent(tbstudent);
    }

    @Override
    public int delectStudentByNo(String no) {
        return tbstudentMapper.delectStudentByNo(no);
    }

    @Override
    public int updateStudent(Tbstudent tbstudent) {
       return tbstudentMapper.updateStudent(tbstudent);
    }

    @Override
    public List<Tbstudent> selectStudent() {
     return   tbstudentMapper.selectStudent();
    }

    @Override
    public Tbstudent selectStudentOne(String on) {

        return tbstudentMapper.selectStudentOne(on);
    }


}
