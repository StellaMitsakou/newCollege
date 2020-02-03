package gr.codehub.newCollege.service;

import gr.codehub.newCollege.model.College;
import gr.codehub.newCollege.model.Course;
import gr.codehub.newCollege.model.Student;
import gr.codehub.newCollege.repository.RepositoryReader;

import java.util.List;

public class CollegeServices {
    public List<Student> getStudents() {
        RepositoryReader repositoryReader = new RepositoryReader();
        College college = repositoryReader.readRepository();
        return college.getStudents();
    }

    public List<Course> getCourses() {
        RepositoryReader repositoryReader = new RepositoryReader();
        College college = repositoryReader.readRepository();
        return college.getCourses();
    }
}
