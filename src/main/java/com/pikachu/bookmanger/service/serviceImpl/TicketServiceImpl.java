package com.pikachu.bookmanger.service.serviceImpl;

import com.pikachu.bookmanger.dao.TicketMapper;
import com.pikachu.bookmanger.model.Ticket;
import com.pikachu.bookmanger.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 23:06
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public int addTicket(Ticket ticket) {
        return ticketMapper.addTicket(ticket);
    }

    @Override
    public Ticket selectByUserId(int uid) {
        return ticketMapper.selectByUserId(uid);
    }

    @Override
    public Ticket selectByTicket(String t) {
        return ticketMapper.selectByTicket(t);
    }

    @Override
    public void deleteTicketById(int tid) {
        ticketMapper.deleteTicketById(tid);
    }

    @Override
    public void deleteTicket(String t) {
        ticketMapper.deleteTicket(t);
    }
}
