package com.pikachu.bookmanger.biz;

import com.pikachu.bookmanger.model.Ticket;
import com.pikachu.bookmanger.model.User;
import com.pikachu.bookmanger.model.exceptions.LoginRegisterException;
import com.pikachu.bookmanger.service.TicketService;
import com.pikachu.bookmanger.service.UserService;
import com.pikachu.bookmanger.utils.ConcurrentUtils;
import com.pikachu.bookmanger.utils.MD5;
import com.pikachu.bookmanger.utils.TicketUtils;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 22:31
 */
@Service
public class LoginBiz {

    @Autowired
    private UserService us;

    @Autowired
    private TicketService ts;

    public String login(String email, String password) throws Exception {
        User user = us.getUserByemail(email);
        //登录信息检查
        if (user == null)
            throw new LoginRegisterException("邮箱不存在");
        if (!StringUtils.equals(MD5.next(password), user.getPassword()))
            throw new LoginRegisterException("密码错误");
        //检查ticket
        Ticket ticket = ts.selectByUserId(user.getId());
        //如果没有t票。生成一个
        if (ticket == null) {
            ticket = TicketUtils.next(user.getId());
            ts.addTicket(ticket);
            ticket.getTicket();
        }
        //是否过期
        if (ticket.getExpiredAt().before(new Date())) {
            //过期的话删除
            ts.deleteTicketById(ticket.getId());
        }
        //赋票根
        ticket = TicketUtils.next(user.getId());
        ts.addTicket(ticket);
        //设置账户
        ConcurrentUtils.setHost(user);
        return ticket.getTicket();
    }
}
