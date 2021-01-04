package com.nacos.demo.controller;

import com.alibaba.fastjson.JSON;
import com.nacos.demo.dao.StudentDao;
import com.nacos.demo.entity.Student;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:蒋书弼
 * @date:2020/12/11 16:55
 */
@RestController
@RequestMapping("/addsomethin")
@Api(value = "/addsomethin", tags = "我的测试类")
public class Add {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/add")
    public Student getAdd(){
        Student student = new Student();
        student.setStudentId("1");
        student.setSex("张三");
        student.setSex("男");
        studentDao.save(student);

        return student;
    }
    @GetMapping("/select")
    public Student getSelect(){

       Student student =  studentDao.findById("4028ee8176510c490176510d0e4e0000").orElse(null);
       return student;
    }
}
