package entities;

import com.ua.dao.realizationDAO.GroupDAO;
import com.ua.dao.studentInterface.StudentGroupClassSQL;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

/**
 * Created by Максим on 14.02.2016.
 */
public class StudentGroup implements StudentGroupClassSQL {
    @Override
    public List<StudentGroup> getAllGroup() {
        return HibernateUtil.getSession().createCriteria(StudentGroup.class).list();
    }

    @Override
    public void addAllGroup(List<StudentGroup> sGroups) {
        for(StudentGroup  group : sGroups){
            saveGroup(group);
        }
    }

    @Override
    public void deleteGroup(StudentGroup studentGroup) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.delete(studentGroup);
        session.getTransaction().commit();
    }

    @Override
    public void saveGroup(StudentGroup studentGroup) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(studentGroup);
        session.getTransaction().commit();
    }

    @Override
    public void updateGroup(StudentGroup studentGroup) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.update(studentGroup);
        session.getTransaction().commit();
    }
}
