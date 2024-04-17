package com.lwh.bean;

/**
 * @author : Luowenhao221
 * @date : 2024/4/7 15:11
 * @Project : JEEtest_1
 */
public class Book {
    private Integer bookid;
    private String bookname;
    private double bookprice;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }
}
