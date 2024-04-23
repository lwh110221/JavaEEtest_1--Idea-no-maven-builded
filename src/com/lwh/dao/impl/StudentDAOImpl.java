package com.lwh.dao.impl;

import com.lwh.bean.Student;
import com.lwh.dao.StudentDAO;
import com.lwh.util.sqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : Luowenhao221
 * @date : 2024/4/23 22:12
 * @Project : JavaEEtest_1-by-Lwh221
 */
public class StudentDAOImpl implements StudentDAO {
    @Override
    public Student login(String stuno, String stupassword) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Student student = null;

        try {
            connection = sqlUtil.getConnection();
            String sql = "SELECT * FROM t_student WHERE stuno = ? AND stupassword = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, stuno);
            preparedStatement.setString(2, stupassword);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                student = new Student();
                student.setStuno(resultSet.getString("stuno"));
                student.setStupassword(resultSet.getString("stupassword"));
                student.setStuname(resultSet.getString("stuname"));
                student.setStusex(resultSet.getString("stusex"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sqlUtil.closeConnection(connection);
        }

        return student;
    }
}