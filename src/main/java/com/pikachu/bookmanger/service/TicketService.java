package com.pikachu.bookmanger.service;

import com.pikachu.bookmanger.model.Ticket;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 23:05
 */
public interface TicketService {
    int addTicket(Ticket ticket);

    Ticket selectByUserId(int uid);

    Ticket selectByTicket(String t);

    void deleteTicketById(int tid);

    void deleteTicket(String t);
}
