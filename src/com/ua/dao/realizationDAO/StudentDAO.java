package com.ua.dao.realizationDAO;

import com.ua.dao.studentInterface.StudentClassDAO;
import entities.Student;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Максим on 14.02.2016.
 */
@Entity
@Table(name = "student")
public class StudentDAO implements Serializable{

    @Id
    @Column(name = "id_student")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStudent;

    @Column(name = "fname")
    private String fName;

    @Column(name = "name")
    private String name;

    @Column(name = "sname")
    private String sName;

    public StudentDAO(String fName, String name, String sName) {
        super();
        this.fName = fName;
        this.name = name;
        this.sName = sName;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "StudentDAO{" +
                "idStudent=" + idStudent +
                ", fName='" + fName + '\'' +
                ", name='" + name + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }
}
