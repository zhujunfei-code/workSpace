package com.zpark.ssm.booksystem.service.Impl;

import com.zpark.ssm.booksystem.entity.Book;
import com.zpark.ssm.booksystem.mapper.BookMapper;
import com.zpark.ssm.booksystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> getBookList(String name, String author) {
        return bookMapper.getBookList(name, author);
    }

    @Override
    public int deleteBookById(Integer id) {
        return 0;
    }

    @Override
    public int addBook(Book bk) {
        return bookMapper.addBook(bk);
    }

    @Override
    public Book selectById(Integer id) {
        return null;
    }

    @Override
    public int updateBook(Book bk) {
        return 0;
    }
}
