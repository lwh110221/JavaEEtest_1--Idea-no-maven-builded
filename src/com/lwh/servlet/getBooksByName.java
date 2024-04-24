package com.lwh.servlet;

import com.lwh.bean.Book;
import java.util.List;
import com.lwh.dao.BookDAO;
import com.lwh.dao.impl.BookDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : Luowenhao221
 * @date : 2024/4/24 17:06
 * @Project : JavaEEtest_1-by-Lwh221
 */

//根据图书名模糊查询图书
@WebServlet("/queryBookByName")
public class getBooksByName extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询所有图书
        String bookName = new String(req.getParameter("bookName").getBytes("ISO-8859-1"), "UTF-8");
        BookDAO bookDAO = new BookDAOImpl();
        List<Book> books = bookDAO.getBooksByName(bookName);
        req.setAttribute("books", books);
        req.getRequestDispatcher("booklist.jsp").forward(req, resp);
    }
}
