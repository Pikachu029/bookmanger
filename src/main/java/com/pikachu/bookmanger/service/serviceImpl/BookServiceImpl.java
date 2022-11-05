package com.pikachu.bookmanger.service.serviceImpl;

import com.pikachu.bookmanger.dao.BookMapper;
import com.pikachu.bookmanger.model.Book;
import com.pikachu.bookmanger.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 橙子
 * @Date: 2022/11/4 15:55
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookmanger;
    @Override
    public List<Book> getBookAll(){
            return bookmanger.selectAll();
        }

    @Override
    public Book getBookById(int i) {
        return bookmanger.selectBookById(i);
    }

    @Override
    public List<Book> getBookByName(String name) {
        return bookmanger.selectBookByName(name);
    }

    @Override
    public int addBook(Book book) {
        return bookmanger.addBook(book);
    }

    @Override
    public void updateBookById(Book book) {
        bookmanger.updateBookById(book);
    }

    @Override
    public void deleteBook(int id) {
        bookmanger.deleteBook(id);
    }


}
