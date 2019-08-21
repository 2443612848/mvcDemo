package com.xjt.controller;

import com.xjt.model.Student;
import com.xjt.service.StudentService;
import com.xjt.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        Student student = studentService.queryByNo(1);
        mv.addObject("student", student);
        mv.setViewName("student");
        return mv;
    }

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }

}
