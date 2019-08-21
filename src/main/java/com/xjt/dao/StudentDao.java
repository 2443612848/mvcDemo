package com.xjt.dao;

import com.xjt.model.Student;

public interface StudentDao {
    Student queryByNo(int sno);
}
