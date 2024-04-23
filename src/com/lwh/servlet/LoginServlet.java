package com.lwh.servlet;

import com.lwh.bean.Student;
import com.lwh.dao.StudentDAO;
import com.lwh.dao.impl.StudentDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : Luowenhao221
 * @date : 2024/4/23 22:34
 * @Project : JavaEEtest_1-by-Lwh221
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private StudentDAO studentDAO = new StudentDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stuno = request.getParameter("stuno");
        String stupassword = request.getParameter("stupassword");

        Student student = studentDAO.login(stuno, stupassword);

        if (student != null) {
            request.getSession().setAttribute("student", student);
            response.sendRedirect("/index.jsp");
        } else {
            request.getSession().setAttribute("错误", "请输入学号和密码");
            response.sendRedirect("/login.jsp");
        }
    }
}
