package com.lwh.dao;

import com.lwh.bean.Student;

import java.util.List;

/**
 * @author : Luowenhao221
 * @date : 2024/4/18 22:20
 * @Project : JavaEEtest_1-by-Lwh221
 */
public interface StudentDAO {
    Student login(String stuno, String password);
}
