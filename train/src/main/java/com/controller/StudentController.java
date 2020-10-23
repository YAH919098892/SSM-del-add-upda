package com.controller;

import com.pojo.Tbstudent;
import com.service.TbstudentService;
import com.util.DateUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.border.TitledBorder;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {
    //控制层调用service层
    @Autowired
    @Qualifier("tbstudentServiceImp")
    public TbstudentService tbstudentService;
    @RequestMapping("/all")
    public String list(Model model, HttpServletResponse response, HttpServletRequest request){
        response.setCharacterEncoding("utf-8");
        List<Tbstudent> tbstudents=tbstudentService.selectStudent();
        model.addAttribute("list",tbstudents);
        System.out.println(tbstudents);
        return "AllStudents";
    }
//添加
@RequestMapping("/add")
public String add(Model model,String no,String name,String gender,String birthdate,String hometown,String classid,String idcard){
    Date aa=new DateUtil().getDate("1999-11-11","yyyy-MM-dd");
   int result= tbstudentService.addStudent(new Tbstudent(no,name,gender,aa,hometown,classid,idcard));
    System.out.println("提交"+result);
    return "redirect:/all";
}
    //删除
    @RequestMapping("/del")
    public String del(String no){
        System.out.println("我是删除获取数据："+no);
        int result=tbstudentService.delectStudentByNo(no);
        System.out.println("删除"+result);
        return "redirect:/all";
    }
    //获取删除的对象
    @RequestMapping("/del2")
    public String del2(String no,Tbstudent tbstudent ,Model model){
        tbstudent=tbstudentService.selectStudentOne(no);
        model.addAttribute("student",tbstudent);
        System.out.println("获取的"+tbstudent.toString());
        return "del";
    }
    //修改
    @RequestMapping("/upda")
    public String upda(String no,Tbstudent tbstudent ,Model model){
        tbstudent=tbstudentService.selectStudentOne(no);
        model.addAttribute("student",tbstudent);
        System.out.println("获取的"+tbstudent.toString());
        return "upda";
    }
    //获取修改的对象2
    @RequestMapping("/upda2")
    public String upda2(Model model,String no,String name,String gender,String birthdate,String hometown,String classid,String idcard){
        Date aa=new DateUtil().getDate("1999-11-11","yyyy-MM-dd");
        int result= tbstudentService.updateStudent(new Tbstudent(no,name,gender,aa,hometown,classid,idcard));
        System.out.println("修改"+result);
        return "redirect:/all";
    }
    //修改页面
    @RequestMapping("/toadd")
    public String toadd(Tbstudent tbstudent){
        System.out.println("走了URL============add");
        return "add";
    }
}
