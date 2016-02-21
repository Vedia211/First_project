package com.ua.dao.realizationDAO;

import com.ua.dao.studentInterface.StudentTicketClassSQL;
import entities.Student;
import entities.StudentTicket;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Максим on 17.02.2016.
 */
public class TicketDAO implements Serializable{

    @Id
    @Column(name = "id_ticket")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTicket;

    @Column(name = "ticket_number")
    private int ticketNumber;

    @OneToOne
    @JoinColumn(name = "student")
    private Student student;

    public TicketDAO(int ticketNumber, Student student) {
        super();
        this.ticketNumber = ticketNumber;
        this.student = student;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "TicketDAO{" +
                "idTicket=" + idTicket +
                ", ticketNumber=" + ticketNumber +
                ", student=" + student +
                '}';
    }
}
