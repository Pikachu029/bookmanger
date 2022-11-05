package com.pikachu.bookmanger.dao;

import com.pikachu.bookmanger.model.Ticket;
import org.springframework.stereotype.Repository;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 22:38
 */
@Repository
public interface TicketMapper {
    int addTicket(Ticket ticket);

    Ticket selectByUserId(int uid);

    Ticket selectByTicket(String t);

    void deleteTicketById(int tid);

    void deleteTicket(String t);

}
