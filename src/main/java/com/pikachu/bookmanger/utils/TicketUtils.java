package com.pikachu.bookmanger.utils;

import com.pikachu.bookmanger.model.Ticket;
import org.joda.time.DateTime;


/**
 * @Author: 橙子
 * @Date: 2022/11/5 23:51
 */
public class TicketUtils {
    public static Ticket next(int uid){
        Ticket ticket = new Ticket();
        ticket.setTicket(UuidUtils.next());
        ticket.setId(uid);

        DateTime dateTime = new DateTime();
        DateTime dateTime1 = dateTime.plusMonths(3);
        ticket.setExpiredAt(dateTime1.toDate());
        return ticket;

    }
}
