package com.atguigu.eduservice.controller;


import com.atguigu.commonutils.R;
import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
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
@Api(tags = "讲师管理")
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {

//    把service 注入
//    rest风格 get post delete
    @Autowired
    private EduTeacherService teacherService;
//   查询讲师表所有数据
    @ApiOperation(value = "查询所有讲师")
   @GetMapping("findAll")

    public R findAllTeacher(){
       List<EduTeacher> list = teacherService.list(null);
       return  R.ok().data("items",list);
   }

//   逻辑删除
    @ApiOperation(value = "删除讲师")
    @DeleteMapping("removeTeacher")
//    通过路径传参
//    public boolean removeTeacher(@PathVariable String id){
//    通过参数传参
    public R removeTeacher(@ApiParam(value = "讲师id",name="id", required = true) @RequestParam String id){
      boolean flag =   teacherService.removeById(id);
      return  flag?R.ok():R.error();

    }

//   添加教师
    @PostMapping("addTeacher")
    public Object addTeacher(@RequestBody Object data){
       teacherService.save((EduTeacher) data);

       return true;
    }





}

