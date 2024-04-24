package com.lwh.dao;

import com.lwh.bean.Book;

import java.util.List;

/**
 * @author : Luowenhao221
 * @date : 2024/4/7 15:13
 * @Project : JEEtest_1
 */
public interface BookDAO {
    void addBook(Book book);//添加图书
    Book getBookById(Integer bookid);//根据图书编号获取图书
    List<Book> getBooksByPriceRange(double minPrice, double maxPrice);//根据价格区间获取图书

                //修改书籍价格
    void updateBookPrice(String bookid, double newPrice);

    List<Book> getBooksByName(String bookName);
}