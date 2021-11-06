package com.atguigu.eduservice.controller;


import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

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
//    rest风格 get post delete
    @Autowired
    private EduTeacherService teacherService;
//   查询讲师表所有数据
   @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
       List<EduTeacher> list = teacherService.list(null);
       return  list;
   }

//   逻辑删除

    @DeleteMapping("removeTeacher")
//    通过路径传参
//    public boolean removeTeacher(@PathVariable String id){
//    通过参数传参
    public  boolean removeTeacher(@RequestParam String id){
        teacherService.removeById(id);
       return false;
    }

//   添加教师
    @PostMapping("addTeacher")
    public Object addTeacher(@RequestBody Object data){
       teacherService.save((EduTeacher) data);

       return true;
    }





}

