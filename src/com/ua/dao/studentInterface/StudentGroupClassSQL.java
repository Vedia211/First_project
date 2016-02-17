package com.ua.dao.studentInterface;

import entities.StudentGroup;

import java.util.List;

/**
 * Created by Максим on 14.02.2016.
 */
public interface StudentGroupClassSQL {
    public List<StudentGroup> getAllGroup();
    public void addAllGroup(List<StudentGroup> sGroups);
    public void deleteGroup(StudentGroup studentGroup);
    public void saveGroup(StudentGroup studentGroup);
    public void updateGroup(StudentGroup studentGroup);
}
