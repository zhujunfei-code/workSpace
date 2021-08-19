package com.zpark.ssm.booksystem.service;

import com.zpark.ssm.booksystem.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    List<Book> getBookList(String name, String author);

    int deleteBookById(Integer id);

    int addBook(Book bk);


    Book selectById(Integer id);

    int updateBook(Book bk);
}
