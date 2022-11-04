package com.pikachu.bookmanger.dao;

import com.pikachu.bookmanger.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 橙子
 * @Date: 2022/11/4 13:03
 */
//@Mapper
@Repository
public interface BookMapper {
    Book selectBookById(int id);

    List<Book> selectBookByName(String book);

    List<Book> selectAll();

    int addBook(Book book);

    void updateBookStatus(int id, int status);


}
