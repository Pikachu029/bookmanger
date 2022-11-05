package com.pikachu.bookmanger.dao;

import com.pikachu.bookmanger.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 17:07
 */
@Repository
public interface UserMapper {
    int addUser(User user);

    User selectById(int id);

    List<User> selectByName(String name);

    User selectByEmail(String email);

    void updatePassword(User user);
}
