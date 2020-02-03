package gr.codehub.newCollege.repository;

import gr.codehub.newCollege.model.Student;
import gr.codehub.newCollege.model.Student;
import gr.codehub.newCollege.util.Util;

import java.util.ArrayList;
import java.util.List;

public class StudentReader {
    public List<Student> readAllStudentData() {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Student c = readStudentData();
            students.add(c);
        }
        return students;
    }

    public Student readStudentData() {
        Student student = new Student();
        String name = Util.randomName("Student");
        student.setName(name);
        return student;
    }
}
