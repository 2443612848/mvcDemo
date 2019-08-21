package com.xjt.service.impl;

import com.xjt.dao.StudentDao;
import com.xjt.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl {
    @Resource
    private StudentDao studentDao;

    public Student queryByNo(int sno) {
        return studentDao.queryByNo(sno);
    }

}
