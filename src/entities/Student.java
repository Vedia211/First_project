package entities;

import com.ua.dao.studentInterface.StudentClassDAO;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

/**
 * Created by Максим on 14.02.2016.
 */
public class Student implements StudentClassDAO{
    @Override
    public List<Student> getAllStudents() {
        return HibernateUtil.getSession().createCriteria(Student.class).list();
    }

    @Override
    public void addAllStudents(List<Student> students) {
        for (Student student:students){
            saveStudent(student);
        }
    }

    @Override
    public void deleteStudent(Student student) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
    }

    @Override
    public void saveStudent(Student student) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }

    @Override
    public void updateStudent(Student student) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
    }
}
