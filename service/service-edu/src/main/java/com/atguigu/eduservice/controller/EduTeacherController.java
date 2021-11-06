package com.atguigu.eduservice.controller;


import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author christina
 * @since 2021-11-06
 */
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {

//    把service 注入
    @Autowired
    private EduTeacherService teacherService;
//   查询讲师表所有数据
   @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
       List<EduTeacher> list = teacherService.list(null);
       return  list;
   }



}

