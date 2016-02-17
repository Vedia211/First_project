package com.ua.dao.studentInterface;

import entities.StudentTicket;

import java.util.List;

/**
 * Created by Максим on 14.02.2016.
 */
public interface StudentTicketClassSQL {
    public List<StudentTicket> getAllStudentTicket();
    public void addAllTicket(List<StudentTicket> studentTickets);
    public void deleteTicket(StudentTicket ticket);
    public void saveTicket(StudentTicket ticket);
    public void updateTicket(StudentTicket ticket);
}
