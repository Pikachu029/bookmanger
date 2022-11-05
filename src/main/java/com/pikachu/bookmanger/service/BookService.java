package com.pikachu.bookmanger.service;

import com.pikachu.bookmanger.dao.BookMapper;
import com.pikachu.bookmanger.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 橙子
 * @Date: 2022/11/4 15:47
 */

public interface BookService {


        public List<Book> getBookAll();
        public Book getBookById(int i);
        public List<Book> getBookByName(String name);
        public int addBook(Book book);
        public void updateBookById(Book book);
        public void deleteBook(int id);


}
