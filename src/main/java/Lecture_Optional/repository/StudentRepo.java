package Lecture_Optional.repository;

import Lecture_Optional.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    private static final List<Student> studentList = new ArrayList<>();

    public static List<Student> getStudentList() {
        return studentList;
    }
}
