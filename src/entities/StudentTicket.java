package entities;

import com.ua.dao.studentInterface.StudentTicketClassSQL;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

/**
 * Created by Максим on 14.02.2016.
 */
public class StudentTicket implements StudentTicketClassSQL {
    @Override
    public List<StudentTicket> getAllStudentTicket() {
        return HibernateUtil.getSession().createCriteria(StudentTicket.class).list();
    }

    @Override
    public void addAllTicket(List<StudentTicket> studentTickets) {
        for (StudentTicket ticket:studentTickets){
            saveTicket(ticket);
        }
    }

    @Override
    public void deleteTicket(StudentTicket ticket) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.delete(ticket);
        session.getTransaction().commit();
    }

    @Override
    public void saveTicket(StudentTicket ticket) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(ticket);
        session.getTransaction().commit();
    }

    @Override
    public void updateTicket(StudentTicket ticket) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.update(ticket);
        session.getTransaction().commit();
    }
}
