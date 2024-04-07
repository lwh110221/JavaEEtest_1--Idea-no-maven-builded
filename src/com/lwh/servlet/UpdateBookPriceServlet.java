package com.lwh.servlet;

import com.lwh.dao.BookDAO;
import com.lwh.dao.impl.BookDAOImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author : Luowenhao221
 * @date : 2024/4/7 19:39
 * @Project : JEEtest_1
 */

@WebServlet("/updateBookPrice")
public class UpdateBookPriceServlet extends HttpServlet {
    private BookDAO bookDAO = new BookDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String bookid = request.getParameter("bookid");
        double newPrice = Double.parseDouble(request.getParameter("newPrice"));

        bookDAO.updateBookPrice(bookid, newPrice);

        response.sendRedirect("query_book.jsp");
    }
}
