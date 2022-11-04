package com.pikachu.bookmanger.controllers;

import com.pikachu.bookmanger.model.Book;
import com.pikachu.bookmanger.service.BookService;
import com.pikachu.bookmanger.service.serviceImpl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 橙子
 * @Date: 2022/11/4 16:37
 */
@Controller
@RequestMapping({"/book"})
public class Bookcontroller {
    @Autowired
    BookService bookService;

    /*@RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    @ResponseBody
    public void doAddBook(
            @RequestParam("id") int id,
            @RequestParam("name") String name,
      @RequestParam("author") String author,
      @RequestParam("price") String price){
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setAuthor(author);
        book.setPrice(price);
        bookService.addBook(book);
//        return book;
    }*/
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    @ResponseBody
    public void doAddBook(
            @RequestBody Book book){
        bookService.addBook(book);
//        return book;
    }
    @ResponseBody
    @RequestMapping(value = {"/select"},method = {RequestMethod.GET})
    public Book findBook(@RequestParam("id") Integer id){
        return bookService.getBookById(id);
    }
    @ResponseBody
    @RequestMapping(value = {"/select1"},method = {RequestMethod.GET})
    public Object findBook(@RequestParam("name")String name, Model model){
        List<Book> books = bookService.getBookByName(name);
        model.addAttribute("book",books);
        Object book = model.getAttribute("book");
        //System.out.println(book);
        return book;
    }

}
