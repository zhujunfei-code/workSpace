package com.zpark.ssm.booksystem.mapper;

import com.zpark.ssm.booksystem.entity.Book;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface BookMapper {

    ////查询所有
    //List<Book> getBookList(@Param("name") String name, @Param("author") String author);


    int deleteBookById(Integer id);

    int addBook(Book bk);


    Book selectById(Integer id);

    int updateBook(Book bk);
}
