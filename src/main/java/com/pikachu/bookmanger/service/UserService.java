package com.pikachu.bookmanger.service;

import com.pikachu.bookmanger.model.Book;
import com.pikachu.bookmanger.model.User;

import java.util.List;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 18:55
 */
public interface UserService {

    public User getUserByemail(String email);

    public User getUserById(int i);

    public List<User> getUserByName(String name);

    public int addUser(User user);

    public void updateUser(User user);
}
