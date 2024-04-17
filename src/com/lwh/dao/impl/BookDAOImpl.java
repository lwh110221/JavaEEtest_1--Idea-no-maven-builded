package com.lwh.dao.impl;

import com.lwh.bean.Book;
import com.lwh.dao.BookDAO;
import com.lwh.util.sqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Luowenhao221
 * @date : 2024/4/7 16:46
 * @Project : JEEtest_1
 */
public class BookDAOImpl implements BookDAO {

    @Override
    public void addBook(Book book) {
        try (Connection connection = sqlUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO t_book (bookname, bookprice) VALUES (?,?)")) {
            preparedStatement.setString(1, book.getBookname());
            preparedStatement.setDouble(2, book.getBookprice());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Book getBookById(Integer bookid) {
        return null;
    }

    @Override
    public List<Book> getBooksByPriceRange(double minPrice, double maxPrice) {
        List<Book> books = new ArrayList<>();
        try (Connection connection = sqlUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM t_book WHERE bookprice BETWEEN ? AND ?")) {
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Book book = new Book();
                book.setBookid(resultSet.getInt("bookid"));
                book.setBookname(resultSet.getString("bookname"));
                book.setBookprice(resultSet.getDouble("bookprice"));
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void updateBookPrice(String bookid, double newPrice) {
        try (Connection connection = sqlUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE t_book SET bookprice = ? WHERE bookid = ?")) {
            preparedStatement.setDouble(1, newPrice);
            preparedStatement.setString(2, bookid);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Failed to update book price. Book ID: " + bookid);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
