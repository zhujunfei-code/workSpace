package com.zpark.ssm.booksystem.Controller;

import com.zpark.ssm.booksystem.entity.Book;
import com.zpark.ssm.booksystem.service.BookService;
import com.zpark.ssm.booksystem.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;

    @PostMapping("/booklist")
    public Object getBookList(@Param("name") String name, @Param("author") String author) {

        List<Book> list = bookService.getBookList(name, author);
        if (list != null) {
            return Result.ok("查找成功").addData("booklist", list);
        }

        return Result.error("书籍不存在");
    }

    @PostMapping("/addbok")
    public Object addBok(Book book) {
        int bk = bookService.addBook(book);
        if (bk > 0) {
            return Result.ok("添加成功").addData("书籍", book);
        }
        return Result.error("添加失败");
    }
}
