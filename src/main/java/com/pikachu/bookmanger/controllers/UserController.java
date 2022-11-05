package com.pikachu.bookmanger.controllers;

import com.pikachu.bookmanger.model.Book;
import com.pikachu.bookmanger.model.User;
import com.pikachu.bookmanger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 19:30
 */
@Controller
@RequestMapping({"/user"})
public class UserController {
    @Autowired
    UserService us;

    @ResponseBody
    @RequestMapping(value = {"/adduser"},method = {RequestMethod.POST})
    public String doAddUser(@RequestBody User user){
        us.addUser(user);
        return "用户注册成功";
    }

    @ResponseBody
    @RequestMapping(value = {"/finduser"},method = {RequestMethod.GET})
    public User findUser(int id){
        return us.getUserById(id);
    }

    //通过name查找User
    @ResponseBody
    @RequestMapping(value = {"/nameuser"}, method = {RequestMethod.GET})
    public Object findUser(@RequestParam("name") String name, Model model) {
        List<User> users = us.getUserByName(name);
        model.addAttribute("user", users);
        Object user = model.getAttribute("user");
        return user;
    }

    //通过email查找User
    @ResponseBody
    @RequestMapping(value = {"/emailuser"}, method = {RequestMethod.GET})
    public Object findUserByEm(@RequestParam("email") String email, Model model) {
        List<User> users = us.getUserByemail(email);
        model.addAttribute("email", email);
        Object user = model.getAttribute("email");
        return user;
    }

    @ResponseBody
    @RequestMapping(value = {"/update"},method = RequestMethod.POST)
    public String updateUser(User user){
        us.updateUser(user);
        return "更新成功";
    }
}
