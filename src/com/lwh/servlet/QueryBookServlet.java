package com.lwh.servlet;

import com.lwh.bean.Book;
import com.lwh.dao.BookDAO;
import com.lwh.dao.impl.BookDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/**
 * @author : Luowenhao221
 * @date : 2024/4/7 15:15
 * @Project : JEEtest_1
 */
@WebServlet("/queryBook")
public class QueryBookServlet extends HttpServlet {
    private BookDAO bookDAO = new BookDAOImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double minPrice = Double.parseDouble(request.getParameter("minPrice"));
        double maxPrice = Double.parseDouble(request.getParameter("maxPrice"));

        List<Book> books = bookDAO.getBooksByPriceRange(minPrice, maxPrice);

        request.setAttribute("books", books);

        request.getRequestDispatcher("query_book.jsp").forward(request, response);

    }
}
