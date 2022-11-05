package com.pikachu.bookmanger.service.serviceImpl;

import com.pikachu.bookmanger.dao.UserMapper;
import com.pikachu.bookmanger.model.User;
import com.pikachu.bookmanger.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 19:21
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByemail(String email) {
        return userMapper.selectByEmail(email);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updatePassword(user);
    }
}
