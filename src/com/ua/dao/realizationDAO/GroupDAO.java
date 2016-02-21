package com.ua.dao.realizationDAO;

import com.ua.dao.studentInterface.StudentGroupClassSQL;
import entities.Student;
import entities.StudentGroup;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Максим on 17.02.2016.
 */
@Entity
@Table(name = "student_group")
public class GroupDAO implements Serializable {

    @Id
    @Column(name = "id_group")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int groupId;

    @Column
    private String group_name;

    @ManyToOne
    @JoinColumn(name = "student")
    private Student student;

    public GroupDAO(String group_name, Student student) {
        super();
        this.group_name = group_name;
        this.student = student;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "GroupDAO{" +
                "groupId=" + groupId +
                ", group_name='" + group_name + '\'' +
                ", student=" + student +
                '}';
    }
}
