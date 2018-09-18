package com.book_online.demo.model;

import java.util.Date;

public class Book {
    private Integer bookid;

    private Integer booktypeid;

    private String bookname;

    private String bookpress;

    private Date bookpubdate;

    private String bookauthor;

    private Double bookprice;

    private Integer bookpages;

    private String bookoutline;

    private Integer bookdealmount;

    private String bookpic;

    private Integer bookstoremount;

    private Date bookstoretime;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getBooktypeid() {
        return booktypeid;
    }

    public void setBooktypeid(Integer booktypeid) {
        this.booktypeid = booktypeid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBookpress() {
        return bookpress;
    }

    public void setBookpress(String bookpress) {
        this.bookpress = bookpress == null ? null : bookpress.trim();
    }

    public Date getBookpubdate() {
        return bookpubdate;
    }

    public void setBookpubdate(Date bookpubdate) {
        this.bookpubdate = bookpubdate;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor == null ? null : bookauthor.trim();
    }

    public Double getBookprice() {
        return bookprice;
    }

    public void setBookprice(Double bookprice) {
        this.bookprice = bookprice;
    }

    public Integer getBookpages() {
        return bookpages;
    }

    public void setBookpages(Integer bookpages) {
        this.bookpages = bookpages;
    }

    public String getBookoutline() {
        return bookoutline;
    }

    public void setBookoutline(String bookoutline) {
        this.bookoutline = bookoutline == null ? null : bookoutline.trim();
    }

    public Integer getBookdealmount() {
        return bookdealmount;
    }

    public void setBookdealmount(Integer bookdealmount) {
        this.bookdealmount = bookdealmount;
    }

    public String getBookpic() {
        return bookpic;
    }

    public void setBookpic(String bookpic) {
        this.bookpic = bookpic == null ? null : bookpic.trim();
    }

    public Integer getBookstoremount() {
        return bookstoremount;
    }

    public void setBookstoremount(Integer bookstoremount) {
        this.bookstoremount = bookstoremount;
    }

    public Date getBookstoretime() {
        return bookstoretime;
    }

    public void setBookstoretime(Date bookstoretime) {
        this.bookstoretime = bookstoretime;
    }
}